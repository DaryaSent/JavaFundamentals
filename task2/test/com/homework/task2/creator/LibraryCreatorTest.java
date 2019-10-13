package com.homework.task2.creator;

import com.homework.task2.library.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class LibraryCreatorTest {

    private static LibraryCreator library=new LibraryCreator();

    @DataProvider(name = "stringsData")
    private static Object[][] getStringsData() {
        List<String> listFromFile=new ArrayList<>();
        listFromFile.add("Tutorial; Математика; 302; 2015; 8; математика");
        listFromFile.add("Science; Иметь или быть?; 320; 1976; психология; Эрих Фромм");

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

        List<Book> library = new ArrayList<>();
        library.add(tutorial);
        library.add(science);

        return new Object[][]{
                {listFromFile, library}
        };
    }

    @Test(dataProvider = "stringsData")
    public void testCreatePlanePositive(List<String> list, List<Book> expectedResult) {
        List<Book> result = library.createLibrary(list);
        Assert.assertEquals(result, expectedResult);
    }
}