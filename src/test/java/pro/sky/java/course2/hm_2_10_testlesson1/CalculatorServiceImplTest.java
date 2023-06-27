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
        double actual = out.plus(DEFAULT_NUM1_1, DEFAULT_NUM2_1);
        double expected = 18;
        assertEquals(expected, actual);
    }
    @Test
    public void plus2() {
        double actual = out.plus(DEFAULT_NUM1_2, DEFAULT_NUM2_2);
        double expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void minus1() {
        double actual = out.minus(DEFAULT_NUM1_1, DEFAULT_NUM2_1);
        double expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void minus2() {
        double actual = out.minus(DEFAULT_NUM1_2, DEFAULT_NUM2_2);
        double expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void multiply1() {
        double actual = out.multiply(DEFAULT_NUM1_1, DEFAULT_NUM2_1);
        double expected = 45;
        assertEquals(expected, actual);
    }
    @Test
    public void multiply2() {
        double actual = out.multiply(DEFAULT_NUM1_2, DEFAULT_NUM2_2);
        double expected = 6.75;
        assertEquals(expected, actual);
    }
    @Test
    public void divide1() {
        double actual = out.divide(DEFAULT_NUM1_1, DEFAULT_NUM2_1);
        double expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void divide2() {
        double actual = out.divide(DEFAULT_NUM1_2, DEFAULT_NUM2_2);
        double expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void throwDivideByZeroException() {
        assertThrows(DivideByZeroException.class, () → out.divide(DEFAULT_NUM1_1, NULL_NUM));

    }




}
