package com.homework.task2.library;

import java.util.Objects;
import java.util.StringJoiner;

public abstract class Book {
    private BookType type;
    private String name;
    private int pages;
    private int year;

    public void Book(){
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getPages(){
        return pages;
    }

    public void setPages(int pages){
        this.pages=pages;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                year == book.year &&
                name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages, year);
    }

    @Override
    public String toString() {
        return new StringJoiner("\t")
                .add("type=" + type)
                .add("name=" + name )
                .add("pages=" + pages)
                .add("year=" + year + "\t")
                .toString();
    }
}



