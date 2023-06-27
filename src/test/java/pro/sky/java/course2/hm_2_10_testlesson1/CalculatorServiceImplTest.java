package pro.sky.java.course2.hm_2_10_testlesson1;


import org.junit.jupiter.api.Test;
import pro.sky.java.course2.hm_2_10_testlesson1.exception.DivideByZeroException;
import pro.sky.java.course2.hm_2_10_testlesson1.service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.hm_2_10_testlesson1.constants.CalculatorServiceImplTestConstants.*;


public class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    @Test
    public void hello() {

        String actual= out.hello();
        assertEquals(WELCOME_MESSAGE, actual);

    }

    @Test
    public void plus1() {
        double actual = out.plus(NUM1_1, NUM2_1);
                assertEquals(CORRECT_SUM1, actual);
    }

    @Test
    public void plus2() {
        double actual = out.plus(NUM1_2, NUM2_2);
                assertEquals(CORRECT_SUM2, actual);
    }

    @Test
    public void minus1() {
        double actual = out.minus(NUM1_1, NUM2_1);
        assertEquals(CORRECT_DIFFERENCE1, actual);
    }

    @Test
    public void minus2() {
        double actual = out.minus(NUM1_2, NUM2_2);
        assertEquals(CORRECT_DIFFERENCE2, actual);
    }

    @Test
    public void multiply1() {
        double actual = out.multiply(NUM1_1, NUM2_1);
        assertEquals(CORRECT_PRODUCT1, actual);
    }
    @Test
    public void multiply2() {
        double actual = out.multiply(NUM1_2, NUM2_2);
        assertEquals(CORRECT_PRODUCT2, actual);
    }
    @Test
    public void divide1() {
        double actual = out.divide(NUM1_1, NUM2_1);
        assertEquals(CORRECT_QUOTIENT1, actual);
    }
    @Test
    public void divide2() {
        double actual = out.divide(NUM1_2, NUM2_2);
        assertEquals(CORRECT_QUOTIENT2, actual);
    }

    @Test
    public void throwDivideByZeroException() {
        assertThrows(DivideByZeroException.class, () -> out.divide(NUM1_1, NULL_NUM));

    }




}
