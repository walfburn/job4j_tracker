package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int d) {
        return d - x;
    }

    public int divide(int e) {
        return e / x;
    }

    public int sumAllOperation(int f) {
        return sum(f) + multiply(f) + minus(f) + divide(f);
    }

    public static void main(String[] args) {
        int result = sum(4);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int resultTwo = calculator.multiply(4);
        System.out.println(resultTwo);
        int resultThree = minus(4);
        System.out.println(resultThree);
        int resultFour = calculator.divide(4);
        System.out.println(resultFour);
        int resultFive = calculator.sumAllOperation(4);
        System.out.println(resultFive);
    }
}
