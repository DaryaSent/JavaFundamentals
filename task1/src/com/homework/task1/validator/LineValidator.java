package com.homework.task1.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineValidator {

    public static boolean validate(String lineFromFile){
        if (lineFromFile == null ) {
            return false;
        }

        Matcher matcher;
        String[] split = lineFromFile.split(" ");
        Pattern patter = Pattern.compile("^([+-]?\\d+(\\.\\d+)?(d|D)?(\\s+|$))+$");

        if (split ==null ) {
            return false;
        }

        for (int i = 0; i < split.length; i++) {
            matcher = patter.matcher(split[i].trim());
            if (!matcher.matches()){
                return false;
            }
        }
        return true;
    }
}
