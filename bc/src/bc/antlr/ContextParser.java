package bc.antlr;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import java.util.Deque;
import java.util.ArrayDeque;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;

public abstract class ContextParser extends Parser {

    Object listener;
    Method[] begin, finish;

    Deque<ParserRuleContext> stack;

    public ContextParser(TokenStream input) {
        super(input);
        stack = new ArrayDeque<>();
    }

    public void setContextListener(Object handlers) {
        listener = handlers;
        if (listener != null) mapHandlers();
    }

    void push(ParserRuleContext ctx) {
        stack.push(ctx);
        if (listener != null) call(begin,ctx);
    }

    @Override
    public void enterRule(ParserRuleContext localctx, int state, int ruleIndex) {
        super.enterRule(localctx,state,ruleIndex);
        if (listener != null) push(localctx);
    }

    @Override
    public void exitRule() {
        super.exitRule();
        if (listener != null) call(finish,stack.pop());
    }

    @Override
    public void enterRecursionRule(ParserRuleContext localctx, int state, int ruleIndex, int precedence) {
        super.enterRecursionRule(localctx,state,ruleIndex,precedence);
        if (listener != null) push(localctx);
    }

    @Override
    public void pushNewRecursionContext(ParserRuleContext localctx, int state, int ruleIndex) {
        super.pushNewRecursionContext(localctx,state,ruleIndex);
        if (listener != null) push(localctx);
    }

    @Override
    public void unrollRecursionContexts(ParserRuleContext parentctx) {
        super.unrollRecursionContexts(parentctx);
        if (listener != null) {
            var q = new ArrayDeque<ParserRuleContext>();
            while (stack.peek() != parentctx) q.push(stack.pop());
            while (!q.isEmpty()) call(finish,q.pop());
        }
    }

    void call(Method[] map, ParserRuleContext ctx) {
        var i = ctx.getRuleIndex();
        if (i > -1 && map[i] != null) {
            try { map[i].invoke(listener,ctx); }
            catch (IllegalAccessException | IllegalArgumentException e) { uncheck(e); }
            catch (InvocationTargetException e) { uncheck(e.getCause()); }
        }
    }

    @SuppressWarnings("unchecked")
    static <T extends Throwable,V> V uncheck(Throwable e) throws T { throw (T)e; }

    void mapHandlers() {
        var n = getRuleNames().length;
        begin = new Method[n];
        finish = new Method[n];
        for (var method : listener.getClass().getDeclaredMethods()) {

            var types = method.getParameterTypes();
            if (types.length != 1) continue;
            if (!ParserRuleContext.class.isAssignableFrom(types[0])) continue;

            var name = method.getName();
            if (name.startsWith("init")) {
                name = Character.toLowerCase(name.charAt(4)) + name.substring(5);
                put(begin,name,method);
            } else if (name.startsWith("on")) {
                name = Character.toLowerCase(name.charAt(2)) + name.substring(3);
                put(finish,name,method);
            }
            
            var ir = method.getAnnotation(ContextParserRule.InitRule.class);
            if (ir != null) {
                putAll(begin,ir.value(),method);
            }
            var or = method.getAnnotation(ContextParserRule.OnRule.class);
            if (or != null) {
                putAll(finish,or.value(),method);
            }
        }
    }
    
    void put(Method[] map, String name, Method method) {
        var i = getRuleIndex(name);
        if (i > -1) map[i] = method;
    }

    void putAll(Method[] map, String[] rules, Method method) {
        for (var rule:rules) put(map,rule,method);
    }

}
