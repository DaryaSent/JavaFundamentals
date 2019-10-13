package com.homework.task1.textreader;

import com.homework.task1.validator.LineValidator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LineValidatorTest {
    LineValidator validator=new LineValidator();

    @DataProvider(name = "lineValidator")
    public Object[][] getStrings(){
        return new Object[][]{{"5.0 2.19 -9", true}, {"8.0 71 5rt", false}, {"0.15 03 9.8", true}, {null, false}};
    }

    @Test(dataProvider = "lineValidator")
    public void testValidate(String given, boolean waitingResult) {
        boolean result=validator.validate(given);
        assertEquals(result, waitingResult);


    }
}