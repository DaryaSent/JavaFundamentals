package com.homework.task2.library;

import java.util.Objects;

public class Science extends Book {

    String branchOfScience;
    String author;

    public void Science(){
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBranchOfScience() {
        return branchOfScience;
    }

    public void setBranchOfScience(String branchOfScience) {
        this.branchOfScience = branchOfScience;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Science science = (Science) o;
        return branchOfScience.equals(science.branchOfScience) &&
                author.equals(science.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), branchOfScience, author);
    }

    @Override
    public String toString() {
        return super.toString()  + "branchOfScience= " + branchOfScience + "\t"+" author= " + author;
    }
}