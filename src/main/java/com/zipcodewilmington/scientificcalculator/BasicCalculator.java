package com.zipcodewilmington.scientificcalculator;

public class BasicCalculator {

    private double number;

    public String add(){

        try {
            Double x = Console.getDoubleInput("First number: ");
            Double y = Console.getDoubleInput("current to: ");
            return x + y;
            return Double.toString(number);
        }
        catch(Exception e){
            return "ERR";
        }
        //update display
    }

    public String subtract(){


        try{
            Double x = Console.getDoubleInput("First number: ");
            Double y = Console.getDoubleInput("minus: ");
            number = x - y;
            return Double.toString(number);

        }

        catch(Exception e){
            Console.println("ERR");
        }
        return number = x - y;
    }

    public String multiply(){

        try{
            Double x = Console.getDoubleInput("First number: ");
            Double y = Console.getDoubleInput("multiplied by: ");
            number = x * y;
            return Double.toString(number);

        }
        catch(Exception e) {
            return "ERR";
        }
    }

=======
    public String divide(double x){


        try{
            Double y = Console.getDoubleInput("divided by: ");
            number = x / y;
            return Double.toString(number);
        }
        catch(Exception e){
            return "ERR";
        }

    }

    public String squareRoot(double x) {


        try{
            number = Math.sqrt(x);
        }
        catch(Exception e){
            Console.println("ERR");
        }
    }
    public double square(){

        try{
            Double x = Console.getDoubleInput("Number to be square: ");
            number = x * x;
        }
        catch(Exception e){
            Console.println("ERR");
        }
    }
}
