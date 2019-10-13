package com.homework.task1.streamutil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamUtilTest {
    private StreamUtill average = new StreamUtill();
    private double [] array = {10, 4, 78, 4.5, 5};

    private StreamUtill minmax = new StreamUtill();
    private double [] array2 = {10, 4, 78, 4.5, 5};

    private StreamUtill sum = new StreamUtill();
    private double [] array3 = {10, 4, 78, 4.5, 5};

    @Test
    void getaverage() {
        double result = average.findAverage(array);
        assertEquals(result, 20.3);
    }

    void findMin() {
        double result = minmax.findMin(array2);
        assertEquals(result, 4);
    }

    @Test
    void findMax() {
        double result = minmax.findMax(array2);
        assertEquals(result, 78);
    }

    void sum() {
        double result = sum.sum(array3);
        assertEquals(result, 101.5);
    }
}
