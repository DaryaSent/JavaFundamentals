package com.homework.task2.creator;

import com.homework.task2.library.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BooksCreatorTest {
    private static BooksCreator bookCreator = new BooksCreator();

    @DataProvider(name = "stringsData")
    private static Object[][] getStringsData() {
        String[] tutorialBook = {"Tutorial", "Математика", "302", "2015", "8", "математика"};

        Tutorial tutorial = new Tutorial();
        tutorial.setType(BookType.Tutorial);
        tutorial.setName("Математика");
        tutorial.setPages(302);
        tutorial.setYear(2015);
        tutorial.setSchoolClass(8);
        tutorial.setSubject("математика");

        String[] scienceBook = {"Science", "Иметь или быть?", "320", "1976", "психология", "Эрих Фромм"};

        Science science = new Science();
        science.setType(BookType.Science);
        science.setName("Иметь или быть?");
        science.setPages(320);
        science.setYear(1976);
        science.setBranchOfScience("психология");
        science.setAuthor("Эрих Фромм");

        String[] fictionBook = {"Fiction", "Убийство в пустоте", "218", "2003", "роман", "Д.Донцова"};

        Fiction fiction = new Fiction();
        fiction.setType(BookType.Fiction);
        fiction.setName("Убийство в пустоте");
        fiction.setPages(218);
        fiction.setYear(2003);
        fiction.setGenre("роман");
        fiction.setAuthor("Д.Донцова");

        return new Object[][]{
                {tutorialBook, tutorial},
                {scienceBook, science},
                {fictionBook, fiction}
        };
    }

    @Test(dataProvider = "stringsData")
    public void testCreatePlanePositive(String[] string, Book expectedResult) {
        Book result = bookCreator.createBooks(string);
        Assert.assertEquals(result, expectedResult);
    }
}