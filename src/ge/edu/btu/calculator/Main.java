package ge.edu.btu.calculator;

import ge.edu.btu.calculator.service.impl.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args) {
        CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();
        System.out.println(calculatorServiceImpl.sum(5,6));
        System.out.println(calculatorServiceImpl.divide(20,5));
        System.out.println(calculatorServiceImpl.divide(22,0));
    }
}
