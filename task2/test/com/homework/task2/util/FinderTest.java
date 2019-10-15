package com.homework.task2.util;

import com.homework.task2.library.Book;
import com.homework.task2.library.BookType;
import com.homework.task2.library.Science;
import com.homework.task2.library.Tutorial;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class FinderTest {
    private static Finder finder=new Finder();

    @DataProvider(name = "FindByPeriod")
    private static Object[][] getFindByPeriod() {
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
                {Arrays.asList(tutorial, science), 2000, 2018, Arrays.asList(tutorial)},
        };
    }

    @Test(dataProvider = "FindByPeriod")
    public void testFindByPeriod(List<Book> books, int yearMin, int yearMax, List<Book> expectedResult) {
        finder.setBooks(books);
        List<Book> result = finder.findByPeriod(yearMin,yearMax);
        Assert.assertEquals(result, expectedResult);
    }

    @DataProvider(name = "FindByYear")
    private static Object[][] getFindByYear() {
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
                {Arrays.asList(tutorial, science), 2015, Arrays.asList(tutorial)},
        };
    }

    @Test(dataProvider = "FindByYear")
    public void testFindByYear(List<Book> books, int year, List<Book> expectedResult) {
        finder.setBooks(books);
        List<Book> result = finder.findByYear(year);
        Assert.assertEquals(result, expectedResult);
    }

    @DataProvider(name = "FindByType")
    private static Object[][] getFindByType() {
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
                {Arrays.asList(tutorial, science), "Tutorial", Arrays.asList(tutorial)},
        };
    }

    @Test(dataProvider = "FindByType")
    public void testFindByType(List<Book> books, String type, List<Book> expectedResult) {
        finder.setBooks(books);
        List<Book> result = finder.findByType(type);
        Assert.assertEquals(result, expectedResult);
    }

    @DataProvider(name = "CountPagesByType")
    private static Object[][] getCountPagesByType() {
        Tutorial tutorial = new Tutorial();
        tutorial.setType(BookType.Tutorial);
        tutorial.setName("Математика");
        tutorial.setPages(302);
        tutorial.setYear(2015);
        tutorial.setSchoolClass(8);
        tutorial.setSubject("математика");

        Tutorial tutorial2 = new Tutorial();
        tutorial2.setType(BookType.Tutorial);
        tutorial2.setName("English");
        tutorial2.setPages(180);
        tutorial2.setYear(2016);
        tutorial.setSchoolClass(10);
        tutorial.setSubject("английский язык");

        return new Object[][]{
                {Arrays.asList(tutorial, tutorial2),"Tutorial", 482},
        };
    }

    @Test(dataProvider = "CountPagesByType")
    public void testCountPagesByType(List<Book> books, String type, int pages) {
        finder.setBooks(books);
        int result = finder.countPagesByType(type);
        Assert.assertEquals(result, pages);
    }

    @DataProvider(name = "CountPagesAll")
    private static Object[][] getCountPagesAll() {
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
                {Arrays.asList(tutorial, science), 622},
        };
    }

    @Test(dataProvider = "CountPagesAll")
    public void testCountPagesAll(List<Book> books, int pages) {
        finder.setBooks(books);
        int result = finder.countPagesAll();
        Assert.assertEquals(result, pages);
    }
}