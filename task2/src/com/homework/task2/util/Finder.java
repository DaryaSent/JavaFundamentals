package com.homework.task2.util;

import com.homework.task2.library.Book;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Finder {

    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> findAfterYear(int year) {

        books=books.stream().filter(book -> book.getYear() >= year).collect(Collectors.toList());
        return books;
    }

    public List<Book> findByYear(int year) {

        books=books.stream().filter(book -> book.getYear()== year).collect(Collectors.toList());
        return books;
    }

    public int countPagesAll() {
        int sumPages=books.stream().mapToInt(Book::getPages).sum();
        return sumPages;
    }

    public List<Book> findByType(String name) {

        books=books.stream().filter(book -> book.getType().equals(name)).collect(Collectors.toList());
        return books;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("\n");
        books.forEach(book -> stringJoiner.add(book.toString()));
        return stringJoiner.toString();
    }
}
