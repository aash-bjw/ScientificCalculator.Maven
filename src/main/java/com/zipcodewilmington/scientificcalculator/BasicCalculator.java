package com.zipcodewilmington.scientificcalculator;

public class BasicCalculator {

    double number;

    public double add(double x, double y){
        return number = x + y;
    }

    public double subtract(double x, double y){
        return number = x - y;
    }

    public double multiply(double x, double y){
        return number = x * y;
    }

    public double divide(double x, double y){
        if (x == 0) {
            System.out.println("Error! Dividing by zero is not allowed!");
            return 0;
        }
        else {
            return number = x / y;
        }
    }

    public double squareRoot(double x){
        return number = Math.sqrt(x);
    }

    public double square(double x){
        return number = x * x;
    }
}
