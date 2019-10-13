package com.homework.task2.comparator;

import com.homework.task2.library.Book;

import java.util.Comparator;

public class CompareBookType implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
