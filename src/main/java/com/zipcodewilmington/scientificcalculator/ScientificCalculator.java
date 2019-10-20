package com.zipcodewilmington.scientificcalculator;

public class ScientificCalculator {

    private double number;

    public double factorial(double x){

        try{
            return "Cannot find result of a negative factorial.";
        }
        else if(x == 0) {
            number = 1;
        }
        else {
            for (double i = 0; i <= x; i++) {
                number *= x;
            }
        }
        return number;

    }

    public double inverse(double x){
        if(x == 0){
            return "Undefined";

        }
        else{
            number = 1/x;
        }
        return number;
    }

    public double switchSign(double x){
        return number = x * -1;
    }

    public double sine(double x){
        return number = Math.sin(x);
    }

    public double cosine(double x){
        return number = Math.cos(x);
    }

    public double tangent(double x){
        return number = Math.tan(x);
    }

    public double inverseSine(double x){
        return number = Math.asin(x);
    }

    public double inverseCosine(double x){
        return number = Math.acos(x);
    }

    public double inverseTangent(double x){
        return number = Math.atan(x);
    }

    public double ln(double x){

        if (x <= 0) {
            return number;
        }
        else{
            return number = Math.log(x);
        }
    }

    public double logBase10(double x){
        if(x <= 0){
            return number;
        }
        else {
            return number = Math.log10(x);
        }
    }

    public double inverselog

}
