package com.homework.task1.sorter;

import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SorterTest {
    public Sorter sort = new Sorter();

    @DataProvider(name = "arrayData")
    public static Object[][] array(){
        return new Object[][]{
                {new double[]{7.5, 3.8, 4.2, 18.0, -5.3}, new double[]{-5.3, 3.8, 4.2, 7.5, 18.0}
                }
        };
    }

    @Test(dataProvider = "arrayData")
    public void testBubbleSort(double[] given, double[] waitingResult) {
        double[] result=sort.bubbleSort(given);
        Assert.assertEquals(result, waitingResult);
    }

    @Test(dataProvider = "arrayData")
    public void testSelSort(double[] given, double[] waitingResult) {
        double[] result=sort.selSort(given);
        Assert.assertEquals(result, waitingResult);
    }

    @Test(dataProvider = "arrayData")
    public void testShellSort(double[] given, double[] waitingResult) {
        double[] result=sort.shellSort(given);
        Assert.assertEquals(result, waitingResult);
    }
}