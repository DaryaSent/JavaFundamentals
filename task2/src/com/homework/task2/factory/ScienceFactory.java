package com.homework.task2.factory;

import com.homework.task2.library.Book;
import com.homework.task2.library.Science;
import org.apache.log4j.Logger;

public class ScienceFactory extends BooksFactory {
    static Logger logger = Logger.getLogger(ScienceFactory.class);

    public Book createOtherBooks(String[] line) {
        Science scienceBook = new Science();

        logger.debug("Adding science features");
        scienceBook.setBranchOfScience(line[4]);
        scienceBook.setAuthor(line[5]);

        logger.info("Science features were added");
        return scienceBook;
    }
}
