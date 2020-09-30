package ge.edu.btu.calculator.service.impl;

public class CalculatorServiceImpl {
    public int sum(int x, int y){
        return x+y;
    }

    public int divide(int x, int y){
        try {
            return x/y;
        } catch (Exception e) {
            System.out.println("you can't divide number on 0");
            return 0;
        }
    }
}