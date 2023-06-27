package pro.sky.java.course2.hm_2_10_testlesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.hm_2_10_testlesson1.service.CalculatorService;
import pro.sky.java.course2.hm_2_10_testlesson1.service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static pro.sky.java.course2.hm_2_10_testlesson1.constants.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplParametrizedTest {
    private final CalculatorService out = new CalculatorServiceImpl();


    @ParameterizedTest
    @MethodSource("provideParamsForPlusTest")
    public void checkCorrectResultsMethodPlus(double Num1, double Num2, double expected) {
        double actual = out.plus(Num1, Num2);
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTest")
    public void checkCorrectResultsMethodMinus(double Num1, double Num2, double expected) {
        double actual = out.minus(Num1, Num2);
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTest")
    public void checkCorrectResultsMethodMultiply(double Num1, double Num2, double expected) {
        double actual = out.multiply(Num1, Num2);
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    public void checkCorrectResultsMethodDivide(double Num1, double Num2, double expected) {
        double actual = out.divide(Num1, Num2);
        Assertions.assertEquals(actual, expected);
    }

    public static Stream<Arguments> provideParamsForPlusTest() {
        return Stream.of(
                Arguments.of(NUM1_1, NUM2_1, CORRECT_SUM1),
                Arguments.of(NUM1_2, NUM2_2, CORRECT_SUM2)

        );
    }

    public static Stream<Arguments> provideParamsForMinusTest() {
        return Stream.of(
                Arguments.of(NUM1_1, NUM2_1, CORRECT_DIFFERENCE1),
                Arguments.of(NUM1_2, NUM2_2, CORRECT_DIFFERENCE2)

        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTest() {
        return Stream.of(
                Arguments.of(NUM1_1, NUM2_1, CORRECT_PRODUCT1),
                Arguments.of(NUM1_2, NUM2_2, CORRECT_PRODUCT2)

        );
    }

    public static Stream<Arguments> provideParamsForDivideTest() {
        return Stream.of(
                Arguments.of(NUM1_1, NUM2_1, CORRECT_QUOTIENT1),
                Arguments.of(NUM1_2, NUM2_2, CORRECT_QUOTIENT2)

        );
    }
}
