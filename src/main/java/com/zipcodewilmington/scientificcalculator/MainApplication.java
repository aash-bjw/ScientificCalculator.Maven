package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!\n" +
                "What would you like to do?\n"+
                "Type 'help' for list of commands.");

        public Double display = 0;

        BasicCalculator calc = new BasicCalculator();

        String s = Console.getStringInput("");
        switch (s){
            case "add":
                //calc.add();
                break;

            case "subtract":
                // calc.subtract(3, 1);
                break;

            case "multiply":

                break;

            case "divide":

                break;

            case "square":

                break;

            case "square root":

                break;

            case "exponent":

                break;

            case "inverse":

                break;

            case "switch sign":

                break;

            case "sine":

                break;

            case "cosine":

                break;

            case "tangent":

                break;

            case "inverse sine":

                break;

            case "inverse cosine":

                break;

            case "inverse tangent":

                break;

            case "log":

                break;

            case "ln":

                break;

            case "inverse log":

                break;

            case "ex":

                break;

            case "degrees":

                break;

            case"radians":

                break;

            case "help":

                break;

            case "m+":

                break;

            case "mc":

                break;

            case "mrc":

                break;

            case "clear":
                display = "0";
                break;

            default:
                try{}
                catch(Exception e) {

                }
                break;


        }

        Console.println(display);


        /*Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
        */

    }
}
