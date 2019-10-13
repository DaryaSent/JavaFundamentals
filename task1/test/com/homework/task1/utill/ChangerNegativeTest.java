package com.homework.task1.utill;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChangerNegativeTest {
    public ArrayUtil changer = new ArrayUtil();

    @DataProvider(name = "arrayData")
    public static Object[][] array(){
        return new Object[][]{
                {new double[]{7.5, 3.8, -4.2, 18.0, -5.3}, new double[]{7.5, 3.8, 4.2, 18.0, 5.3}}
        };
    }

    @Test(dataProvider ="arrayData" )
    public void testChange(double[] given, double[] waitingResult) {
        double[] result=changer.change(given);
        assertEquals(result, waitingResult);
    }
}
