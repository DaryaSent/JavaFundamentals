package com.homework.task2.util;

import com.homework.task2.library.Book;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Finder {
    static Logger logger = Logger.getLogger(Finder.class);
    private List<Book> books;

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> findByPeriod(int yearMin, int yearMax) {
        logger.debug("Books from "+yearMin+" to "+yearMax+" were founded");
        books=books.stream().filter(book -> book.getYear() >= yearMin && book.getYear()  <= yearMax).collect(Collectors.toList());
        return books;
    }

    public List<Book> findByYear(int year) {
        logger.debug("Books of "+year+" were founded");
        books=books.stream().filter(book -> book.getYear()== year).collect(Collectors.toList());
        return books;
    }

    public List<Book> findByType(String name) {
        logger.debug("All "+name+" Books were founded");
        books=books.stream().filter(book -> book.getType().name().equals(name)).collect(Collectors.toList());
        return books;
    }

    public int countPagesByType(String name) {
        logger.debug("Count all pages of "+name+" Books");
        books=books.stream().filter(book -> book.getType().name().equals(name)).collect(Collectors.toList());
        int sumPages=books.stream().mapToInt(Book::getPages).sum();
        return sumPages;
    }

    public int countPagesAll() {
        logger.debug("Count all pages");
        int sumPages=books.stream().mapToInt(Book::getPages).sum();
        return sumPages;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("\n");
        books.forEach(book -> stringJoiner.add(book.toString()));
        return stringJoiner.toString();
    }
}
