package com.homework.task1.textreader;

import com.homework.task1.exception.TextException;
import com.homework.task1.validator.LineValidator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TextReader {
    private ArrayList<String> list = new ArrayList<>();
    BufferedReader lineReader;
    String line;

    public List<String> textRead(File file) throws TextException {
        try {
            lineReader = new BufferedReader(new java.io.FileReader(file));
            
            if (file.length() == 0) {
                throw new TextException("Файл пуст");
            }

            while ((line = lineReader.readLine()) != null) {
                if (LineValidator.validate(line)) {
                    list.addAll(Arrays.asList(line.split(" ")));
                }
            }
            
        } catch(FileNotFoundException e) {
            throw new TextException("Файл с именем "+ file +" не найден");
            
        } catch (IOException e) {
           throw new TextException("ошибка чтения строки",e);

        } finally {
            try {
                    if (lineReader != null) {
                        lineReader.close();
                    }
            } catch (IOException e) {
                System.out.println("Проблема закрытия");
            }
        }
       return list;
    }
}      
