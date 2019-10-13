package com.homework.task2.comparator;

import com.homework.task2.library.Book;

import java.util.Comparator;

public class CompareYear implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}
