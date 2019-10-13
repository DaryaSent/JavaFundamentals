package com.homework.task2;

import com.homework.task2.exception.TextException;
import com.homework.task2.library.Book;
import com.homework.task2.creator.LibraryCreator;
import com.homework.task2.reader.TextReader;
import com.homework.task2.util.Finder;
import com.homework.task2.validator.ListValidator;
import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) throws TextException {


        File fail=new File("resources/Library");
        TextReader read=new TextReader();
        List<String> text=read.textRead(fail);

        ListValidator load=new ListValidator();
        List<String> list=load.verifyList(text);

        LibraryCreator pars= new LibraryCreator();
        List<Book> st=pars.createLibrary(list);
         System.out.println(st);

        Finder ut=new Finder();
        ut.setBooks(st);

        System.out.println(ut.findByType("Science"));







    }
}


