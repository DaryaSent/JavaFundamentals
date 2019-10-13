package com.homework.task2.library;

import java.util.Objects;

public class Fiction extends Book {
    private String genre;
    private String author;

    public void Fiction(){
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fiction fiction = (Fiction) o;
        return genre.equals(fiction.genre) &&
                author.equals(fiction.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), genre, author);
    }

    @Override
    public String toString() {

        return super.toString() + "genre= " + genre+ "\t"+ " author= " + author;
    }
}
