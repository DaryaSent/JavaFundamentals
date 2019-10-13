package com.homework.task1.utill;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MaxMinTest {
    private ArrayUtil maxmin = new ArrayUtil();

    @DataProvider(name = "findMax")
    public static Object[][] max(){
        return new Object[][]{
                {new double[]{7.5, 3.5, -4.3, 55.6, 14.0}, 55.6 }
        };
    }

    @DataProvider
    public static Object[][] min(){
        return new Object[][]{
                {new double[]{7.5, 3.5, -4.2, 5.6, 14.0}, -4.2 }
        };
    }

    @Test(dataProvider ="findMax")
    public void testMax(double[] given, double waitingResult) {
        double result=maxmin.max(given);
        assertEquals(result, waitingResult);
    }

    @Test(dataProvider ="min")
    public void testMin(double[] given, double waitingResult) {
        double result=maxmin.min(given);
        assertEquals(result, waitingResult);
    }
}
