package com.homework.task1;

import com.homework.task1.exception.TextException;
import com.homework.task1.textreader.TextReader;
import com.homework.task1.parser.Parser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException, TextException {
        TextReader b=new TextReader();
        File a=new File("MassiveRange");
        Parser c=new Parser();
        ArrayList<String> stroka=b.textRead(a);
        System.out.println(stroka);
        double[] d=c.convertToArray(stroka);
        System.out.println(Arrays.toString(d));











    }
}
