package com.homework.task1.utill;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumTest {
    private ArrayUtil summa = new ArrayUtil();

    @DataProvider(name = "arrayData")
    public static Object[][] array(){
        return new Object[][]{
                {new double[]{7.5, 3.5, -4, 5.6, 14}, 26.6 }
        };
    }

    @Test(dataProvider = "arrayData")
    public void testSum(double[] given, double waitingResult) {
        double result=summa.sum(given);
        assertEquals(result, waitingResult);
    }
}
