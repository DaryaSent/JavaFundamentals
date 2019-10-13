package com.homework.task2.comparator;

import com.homework.task2.library.Book;

import java.util.Comparator;

public class ComparePages implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getPages(), o2.getPages());
    }
}
