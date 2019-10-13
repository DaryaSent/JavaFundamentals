package com.homework.task1.parser;

import java.util.ArrayList;

public class Parser {
    public static double[] convertToArray(List<String> list) {
       double[] doubles = new double[list.size()];
       int listSize=list.size();

        for (int i = 0; i < listSize; i++) {
            doubles[i] = Double.parseDouble(list.get(i));
        }
        return doubles;
    }
}
