package com.homework.task1.utill;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AverageTest {
    private ArrayUtil average = new ArrayUtil();

    @DataProvider(name = "arrayData")
    public static Object[][] array(){
        return new Object[][]{
               {new double[]{7.5, 3.5, 4, 5}, 5 }
        };
    }

    @Test(dataProvider ="arrayData" )
    void average(double[] given, double waitingResult) {
        double resul=average.average(given);
        assertEquals(resul, waitingResult);
    }
}
