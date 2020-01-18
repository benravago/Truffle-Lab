package bc.antlr;

import org.junit.jupiter.api.Test;

import static bc.antlr.Any.*;

class AllTests {

    @Test void test_add_1() throws Exception { exec("add_1.bc"); }
    @Test void test_add_2() throws Exception { exec("add_2.bc"); }
    @Test void test_add_3() throws Exception { exec("add_3.bc"); }
    @Test void test_add_4() throws Exception { exec("add_4.bc"); }
    @Test void test_and_1() throws Exception { exec("and_1.bc"); }
    @Test void test_arithmetic_1() throws Exception { exec("arithmetic_1.bc"); }
    @Test void test_array_1() throws Exception { exec("array_1.bc"); }
    @Test void test_array_2() throws Exception { exec("array_2.bc"); }
    @Test void test_array_3() throws Exception { exec("array_3.bc"); }
    @Test void test_array_4() throws Exception { exec("array_4.bc"); }
    @Test void test_comp_1() throws Exception { exec("comp_1.bc"); }
    @Test void test_comp_2() throws Exception { exec("comp_2.bc"); }
    @Test void test_empty() throws Exception { exec("empty.bc"); }
    @Test void test_for_2() throws Exception { exec("for_2.bc"); }
    @Test void test_for() throws Exception { exec("for.bc"); }
    @Test void test_increment() throws Exception { exec("increment.bc"); }
    @Test void test_mul_1() throws Exception { exec("mul_1.bc"); }
    @Test void test_op_1() throws Exception { exec("op_1.bc"); }
    @Test void test_op_2() throws Exception { exec("op_2.bc"); }
    @Test void test_op_3() throws Exception { exec("op_3.bc"); }
    @Test void test_or_1() throws Exception { exec("or_1.bc"); }
    @Test void test_pow_1() throws Exception { exec("pow_1.bc"); }
    @Test void test_sub_1() throws Exception { exec("sub_1.bc"); }
    @Test void test_var_10() throws Exception { exec("var_10.bc"); }
    @Test void test_var_11() throws Exception { exec("var_11.bc"); }
    @Test void test_var_12() throws Exception { exec("var_12.bc"); }
    @Test void test_var_1() throws Exception { exec("var_1.bc"); }
    @Test void test_var_2() throws Exception { exec("var_2.bc"); }
    @Test void test_var_3() throws Exception { exec("var_3.bc"); }
    @Test void test_var_4() throws Exception { exec("var_4.bc"); }
    @Test void test_var_5() throws Exception { exec("var_5.bc"); }
    @Test void test_var_6() throws Exception { exec("var_6.bc"); }
    @Test void test_var_7() throws Exception { exec("var_7.bc"); }
    @Test void test_var_8() throws Exception { exec("var_8.bc"); }
    @Test void test_var_9() throws Exception { exec("var_9.bc"); }
    @Test void test_while_2() throws Exception { exec("while_2.bc"); }
    @Test void test_while_3() throws Exception { exec("while_3.bc"); }
    @Test void test_while() throws Exception { exec("while.bc"); }

}
