package com.homework.task2.util;

import com.homework.task2.comparator.*;
import com.homework.task2.library.Book;
import org.apache.log4j.Logger;

import java.util.List;

public class Sorter {
    static Logger logger = Logger.getLogger(Sorter.class);

    public List<Book> sortByType(List<Book> books) {
        logger.debug("Sort Books by type");
        books.sort(new CompareBookType());
        books.sort(new CompareNames());
        return books;
    }

    public List<Book> sortNames(List<Book> books) {
        logger.debug("Sort Books by names");
        books.sort(new CompareNames());
        return books;
    }

    public List<Book> sortByYear(List<Book> books) {
        logger.debug("Sort Books by year");
        books.sort(new CompareYear());
        return books;
    }

    public List<Book> sortByPages(List<Book> books) {
        logger.debug("Sort Books by number of pages");
        books.sort(new ComparePages());
        return books;
    }
}
