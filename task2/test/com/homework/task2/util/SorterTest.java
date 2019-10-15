package com.homework.task2.util;

import com.homework.task2.library.Book;
import com.homework.task2.library.BookType;
import com.homework.task2.library.Science;
import com.homework.task2.library.Tutorial;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class SorterTest {
    private static Sorter sorter=new Sorter();


    @DataProvider(name = "SortByType")
    private static Object[][] getSortByType() {
        Tutorial tutorial = new Tutorial();
        tutorial.setType(BookType.Tutorial);
        tutorial.setName("Математика");
        tutorial.setPages(302);
        tutorial.setYear(2015);
        tutorial.setSchoolClass(8);
        tutorial.setSubject("математика");

        Science science = new Science();
        science.setType(BookType.Science);
        science.setName("Иметь или быть?");
        science.setPages(320);
        science.setYear(1976);
        science.setBranchOfScience("психология");
        science.setAuthor("Эрих Фромм");

        return new Object[][]{
                {Arrays.asList(science,tutorial),Arrays.asList(science,tutorial)}
        };
    }

    @Test(dataProvider = "SortByType")
    public void testSortByType(List<Book> books,List<Book> expectedResult) {
        List<Book> result = sorter.sortByType(books);
        Assert.assertEquals(result, expectedResult);
    }

    @DataProvider(name = "SortNames")
    private static Object[][] getSortNames() {
        Tutorial tutorial = new Tutorial();
        tutorial.setType(BookType.Tutorial);
        tutorial.setName("Математика");
        tutorial.setPages(302);
        tutorial.setYear(2015);
        tutorial.setSchoolClass(8);
        tutorial.setSubject("математика");

        Science science = new Science();
        science.setType(BookType.Science);
        science.setName("Иметь или быть?");
        science.setPages(320);
        science.setYear(1976);
        science.setBranchOfScience("психология");
        science.setAuthor("Эрих Фромм");

        return new Object[][]{
                {Arrays.asList(science,tutorial),Arrays.asList(science,tutorial)}
        };
    }

    @Test(dataProvider = "SortNames")
    public void testSortNames(List<Book> books, List<Book> expectedResult) {
        List<Book> result = sorter.sortNames(books);
        Assert.assertEquals(result, expectedResult);
    }

    @DataProvider(name = "SortByYear")
    private static Object[][] getSortByYear() {
        Tutorial tutorial = new Tutorial();
        tutorial.setType(BookType.Tutorial);
        tutorial.setName("Математика");
        tutorial.setPages(302);
        tutorial.setYear(2015);
        tutorial.setSchoolClass(8);
        tutorial.setSubject("математика");

        Science science = new Science();
        science.setType(BookType.Science);
        science.setName("Иметь или быть?");
        science.setPages(320);
        science.setYear(1976);
        science.setBranchOfScience("психология");
        science.setAuthor("Эрих Фромм");

        return new Object[][]{
                {Arrays.asList(science,tutorial),Arrays.asList(science,tutorial)}
        };
    }

    @Test(dataProvider = "SortByYear")
    public void testSortByYear(List<Book> books, List<Book> expectedResult) {
        List<Book> result = sorter.sortByYear(books);
        Assert.assertEquals(result, expectedResult);
    }

    @DataProvider(name = "SortByPages")
    private static Object[][] getSortByPages() {
        Tutorial tutorial = new Tutorial();
        tutorial.setType(BookType.Tutorial);
        tutorial.setName("Математика");
        tutorial.setPages(302);
        tutorial.setYear(2015);
        tutorial.setSchoolClass(8);
        tutorial.setSubject("математика");

        Science science = new Science();
        science.setType(BookType.Science);
        science.setName("Иметь или быть?");
        science.setPages(320);
        science.setYear(1976);
        science.setBranchOfScience("психология");
        science.setAuthor("Эрих Фромм");

        return new Object[][]{
                {Arrays.asList(science,tutorial),Arrays.asList(tutorial,science)}
        };
    }

    @Test(dataProvider = "SortByPages")
    public void testSortByPages(List<Book> books, List<Book> expectedResult) {
        List<Book> result = sorter.sortByPages(books);
        Assert.assertEquals(result, expectedResult);
    }
}