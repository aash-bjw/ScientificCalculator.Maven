package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicCalculator;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class BasicCalcTests {


    private BasicCalculator calc = new BasicCalculator();


    @Test
    public void addTest1(){

        double x = 5;
        double y = 5;

        double expected = 10;
        double actual = calc.add(x,y);

        assertEquals(expected, actual);
    }

    @Test
    public void addTest2(){

        double x = 25;
        double y = 5;

        double expected = 30;
        double actual = calc.add(x,y);

        assertEquals(expected, actual);
    }

    @Test
    public void addTest3(){

        double x = 75;
        double y = .5;

        double expected = 75.5;
        double actual = calc.add(x,y);

        assertEquals(expected, actual);
    }

    @Test
    public void subtractTest1(){

        double x = 75;
        double y = 10;

        double expected = 65;
        double actual = calc.subtract(x,y);

        assertEquals(expected, actual);

    }

    @Test
    public void subtractTest2(){

        double x = 50;
        double y = 5.5;

        double expected = 44.5;
        double actual = calc.subtract(x,y);

        assertEquals(expected, actual);

    }

    @Test
    public void subtractTest3(){

        double x = 100;
        double y = 7.65;

        double expected = 92.35;
        double actual = calc.subtract(x,y);

        assertEquals(expected, actual);

    }

    @Test
    public void multiplyTest1(){

        double x = 40;
        double y = 4;

        double expected = 160;
        double actual = calc.multiply(x,y);

        assertEquals(expected, actual);

    }

    @Test
    public void multiplyTest2(){

        double x = 7.5;
        double y = 4.4;

        double expected = 33;
        double actual = calc.multiply(x,y);

        assertEquals(expected, actual);

    }

    @Test
    public void multiplyTest3(){

        double x = 800;
        double y = 6.6;

        double expected = 5280;
        double actual = calc.multiply(x,y);

        assertEquals(expected, actual);

    }

    @Test
    public void divideTest1(){
        double x = 865;
        double y = 5;

        double expected = 173;
        double actual = calc.divide(x,y);

        assertEquals(expected, actual);

    }

    @Test
    public void divideTest2(){
        double x = 740;
        double y = 10;

        double expected = 74;
        double actual = calc.divide(x,y);

        assertEquals(expected, actual);
    }

    @Test
    public void divideTest3(){
        double x = 80;
        double y = 2;

        double expected = 40;
        double actual = calc.divide(x,y);

        assertEquals(expected, actual);


    }
}
