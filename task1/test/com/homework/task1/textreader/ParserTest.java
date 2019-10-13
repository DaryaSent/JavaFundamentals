package com.homework.task1.textreader;

import com.homework.task1.parser.Parser;
import org.junit.jupiter.api.Test;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {
    private Parser parse = new Parser();;
    private ArrayList<String> list = new ArrayList<String>();
    double[] array=new double[]{5, 9,10, -14, 7};

    @Test
    void convertToArray() {
        list.add("5");
        list.add("9.0");
        list.add("10");
        list.add("-14");
        list.add("7");
        double[] result = parse.convertToArray(list);
        assertArrayEquals(result, array);
    }
}