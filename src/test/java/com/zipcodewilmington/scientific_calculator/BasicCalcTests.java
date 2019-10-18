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
    public void multiplyTest(){

    }

    @Test
    public void divideTest(){

    }
}
