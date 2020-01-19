package bc.antlr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

class Tools {

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
                  : c instanceof ContextParserRule ? userData(c)
                  : "";
            System.out.println("  "+i+' '+c.getClass().getSimpleName()+' '+s);
        }
    }

    static String userData(Object o) {
        var t = ((ContextParserRule)o).getUserData();
        return t instanceof Object[] ? Arrays.deepToString((Object[])t) : String.valueOf(t);
    }

    static Object[] cat(Object[] a, Object b) {
        var c = Arrays.copyOf(a,a.length+1);
        c[a.length] = b;
        return c;
    }

    static Object[] as(Object... a) { return a; }

    @SuppressWarnings("unchecked")
    static Object[] mock(Object... in) {
        var out = new ArrayList<Object>();
        for (var i = 0; i < in.length; i++) {
            var o = in[i];
            if (o instanceof List) {
                collect(out,(List<ParseTree>)o,(String)in[i+1],(String)in[i+2]);
                break;
            } else {
                out.add(o);
            }
        }
        return out.toArray();
    }

    static void collect(List<Object> out, List<ParseTree> children, String from, String to) {
        var in = children.iterator();
        if (from != null) {
            while (in.hasNext()) {
                var o = in.next();
                if (o instanceof TerminalNode) {
                   if (String.valueOf(o).equals(from)) break;
                }
            }
        }
        while (in.hasNext()) {
            var o = in.next();
            if (o instanceof TerminalNode) {
                if (String.valueOf(o).equals(to)) break;
            }
            if (o instanceof ContextParserRule) {
               out.add(ContextParserRule.userData((ContextParserRule)o));
            }
        }
    }

}
