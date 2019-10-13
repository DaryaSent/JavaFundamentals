package com.homework.task1.streamutil;

import java.util.Arrays;

public class StreamUtil {
    
     public double findMin(double[] array)  {
        return Arrays.stream(array).min().getAsDouble();
    }

    public double findMax(double[] array) {
        return  Arrays.stream(array).max().getAsDouble();
    }

    public double findAverage(double[] array)  {
        return  Arrays.stream(array).average().getAsDouble();
    }
    
    public double sum(double[] array)  {
        return  Arrays.stream(array).sum();
    }
    
}



