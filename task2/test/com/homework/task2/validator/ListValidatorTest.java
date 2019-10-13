package com.homework.task2.validator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ListValidatorTest {

    @DataProvider(name = "strings")
    private static Object[][] getTestStrings() {
        return new Object[][]{
                {"Science; Иметь или быть?; 320; 1976; психология; Эрих Фромм", true},
                {"Science; Иметь или быть?; 320 ; 1976; психология; Эрих Фромм; 5", false},
                {"Science; 15; 320 ; 1976; психология; Эрих Фромм; 5", false},
                {"", false}
        };
    }

    @Test(dataProvider = "strings")
    public void IsValidString(String string, boolean expected) {
        boolean result = ListValidator.isValid(string);
        Assert.assertEquals(result, expected);
    }
}