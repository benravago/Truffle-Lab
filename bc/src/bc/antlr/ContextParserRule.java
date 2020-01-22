package bc.antlr;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings("unchecked")
public class ContextParserRule extends ParserRuleContext {

    public ContextParserRule() {
        super();
    }

    public ContextParserRule(ParserRuleContext parent, int invokingStateNumber) {
        super(parent,invokingStateNumber);
    }

    private Object userData;

    public <T> T getUserData() { return (T) userData; }
    public <T> void setUserData(T userData) { this.userData = userData; }
    
    public <T> T userData() {
        return userData != null ? (T) userData
             : getChildCount() == 1 ? userData(0)
             : null;
    }

    public <T> T userData(int i) {
        var c = getChild(i);
        return c instanceof ContextParserRule ? ((ContextParserRule)c).userData() : null;
    }

    public String token(int i) {
        var c = getChild(i);
        return c instanceof TerminalNode ? String.valueOf(c) : null;
    }
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface InitRule {
        String[] value();
    }
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface OnRule {
        String[] value();
    }

}

//  public <T> T userData(int i) {
//      var c = getChild(i);
//      while (c instanceof ContextParserRule) {
//          var t = ((ContextParserRule)c).getUserData();
//          if (t != null) return (T)t;
//          if (c.getChildCount() != 1) break;
//          c = c.getChild(0);
//      }
//      return null;
//  }

