package com.homework.task2.reader;

import com.homework.task2.exception.TextException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class TextReaderTest {
    private static  TextReader reader = new TextReader();
    private static  File file=new File("test/resources/Library");

    @Test
    public void testReadFile() throws TextException {
        List<String> lines = reader.textRead(file);
        int result = lines.size();
        int expectedResult = 9;
        Assert.assertEquals(result, expectedResult);
    }
}