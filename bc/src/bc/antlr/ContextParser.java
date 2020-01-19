package bc.antlr;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;

public abstract class ContextParser extends Parser {

    Object listener;
    Map<String,Method> begin, finish;

    Deque<ParserRuleContext> stack;

    public ContextParser (TokenStream input) {
        super(input);
        stack = new ArrayDeque<>();
    }

    public void setContextListener(Object listener) {
        this.listener = listener;
        mapHandlers();
    }

    void push(ParserRuleContext ctx) {
        stack.push(ctx);
        if (begin != null) call(begin,ctx);
    }

    @Override
    public void enterRule(ParserRuleContext localctx, int state, int ruleIndex) {
        super.enterRule(localctx,state,ruleIndex);
        if (listener != null) push(localctx);
    }

    @Override
    public void exitRule() {
        super.exitRule();
        if (listener != null) {
            var ctx = stack.pop();
            if (finish != null) call(finish,ctx);
        }
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
            if (finish != null) {
                while (!q.isEmpty()) call(finish,q.pop());
            }
        }
    }

    void call(Map<String,Method> map, ParserRuleContext ctx) {
        var m = map.get(ctx.getClass().getSimpleName());
        if (m != null) {
            try { m.invoke(listener,ctx); }
            catch (IllegalAccessException | IllegalArgumentException e) { uncheck(e); }
            catch (InvocationTargetException e) { uncheck(e.getCause()); }
        }
    }

    @SuppressWarnings("unchecked")
    static <T extends Throwable,V> V uncheck(Throwable e) throws T { throw (T)e; }

    void mapHandlers() {
        var init = new HashMap<String,Method>();
        var on = new HashMap<String,Method>();
        for (var method : listener.getClass().getDeclaredMethods()) {

            var types = method.getParameterTypes();
            if (types.length != 1) continue;
            var type = types[0];
            if (!ParserRuleContext.class.isAssignableFrom(type)) continue;

            var context = type.getSimpleName();
            var rule = context.substring(0,context.length()-7);
            var m = method.getName();
            if (m.equals("init"+rule)) {
                init.put(context,method);
            } else if (m.equals("on"+rule)) {
                on.put(context,method);
            }

            var ir = method.getAnnotation(ContextParserRule.InitRule.class);
            if (ir != null) {
                putAll(init,ir.value(),method);
            }
            var or = method.getAnnotation(ContextParserRule.OnRule.class);
            if (or != null) {
                putAll(on,or.value(),method);
            }
        }
        begin = init.isEmpty() ? null : init;
        finish = on.isEmpty() ? null : on;
    }

    static void putAll(Map<String,Method> map, String[] rules, Method value) {
        for (var k:rules) {
            var key = Character.toUpperCase(k.charAt(0)) + k.substring(1) + "Context";
            map.put(key,value);
        }
    }

}
