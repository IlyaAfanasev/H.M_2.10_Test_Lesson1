package pro.sky.java.course2.hm_2_10_testlesson1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.hm_2_10_testlesson1.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("plus")
    public String add(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return Double.toString(calculatorService.plus(num1, num2));

    }

    @GetMapping("minus")
    public String minus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return Double.toString(calculatorService.minus(num1, num2));

    }

    @GetMapping("multiply")
    public String multiply(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return Double.toString(calculatorService.multiply(num1, num2));

    }
    @GetMapping("divide")
    public String divide(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return Double.toString(calculatorService.divide(num1, num2));

    }


}
