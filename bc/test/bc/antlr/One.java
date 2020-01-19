package bc.antlr;
import org.junit.jupiter.api.Test;
class One {
    static BcEval bc = new BcEval();
    @Test void test() throws Exception { bc.exec("pow_1.bc"); }
    // pow_1.bc add_3.bc
}
