package pro.sky.java.course2.hm_2_10_testlesson1.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.hm_2_10_testlesson1.exception.DivideByZeroException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {

        return "Добро пожаловать в калькулятор";

    }

    @Override
    public double plus(double num1, double num2) {

        return num1 + num2;
    }


    @Override
    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new DivideByZeroException("Делить на 0 нельзя");
        }
        return num1 / num2;
    }
}
