package bc.antlr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import bc.antlr.ContextParserRule;

class Rules { 

    static StackWalker st = StackWalker.getInstance();

    static void init(ContextParserRule ctx) {
        var t = st.walk(s -> s.skip(1).findFirst().get());
        System.out.println("<- " + t.getMethodName());
    }
    static void on(ContextParserRule ctx) {
        var t = st.walk(s -> s.skip(1).findFirst().get());
        System.out.println("-> " + t.getMethodName());
        var n = ctx.getChildCount();
        for (var i = 0; i < n; i++) {
            var c = ctx.getChild(i);
            var s = c instanceof TerminalNode ? c.toString()
                  : c instanceof ContextParserRule ? toString(c)
                  : "";
            System.out.println("  "+i+' '+c.getClass().getSimpleName()+' '+s);
        }
    }

    static String toString(Object o) {
        var t = ((ContextParserRule)o).userData();
        return t instanceof Object[] ? Arrays.deepToString((Object[])t) : String.valueOf(t);
    }

    static Object[] userData(List<ParseTree> children) {
        var out = new ArrayList<Object>();
        for (var c:children){
            if (c instanceof ContextParserRule) {
                out.add(((ContextParserRule)c).userData());
            } 
        }
        return out.toArray();
    }
    
    static Object[] userData(List<ParseTree> children, String from, String to) {
        var out = new ArrayList<Object>();
        var in = children.iterator();
        if (from != null) {
            while (in.hasNext()) {
                var c = in.next();
                if (c instanceof TerminalNode) {
                   if (String.valueOf(c).equals(from)) break;
                }
            }
        }
        while (in.hasNext()) {
            var c = in.next();
            if (c instanceof TerminalNode) {
                if (String.valueOf(c).equals(to)) break;
            }
            if (c instanceof ContextParserRule) {
               out.add(((ContextParserRule)c).userData());
            }
        }
        return out.toArray();
    }
    
    static Object[] as(Object... objects) { return objects; }
}
