package com.homework.task2.factory;

import com.homework.task2.library.Book;
import com.homework.task2.library.Fiction;
import org.apache.log4j.Logger;

public class FictionFactory extends BooksFactory {
    static Logger logger = Logger.getLogger(FictionFactory.class);

    public Book createOtherBooks(String[] line) {
        Fiction fictionBook = new Fiction();

        logger.debug("Adding fiction features");
        fictionBook.setGenre(line[4]);
        fictionBook.setAuthor(line[5]);

        logger.info("Fiction features were added");
        return fictionBook;
    }
}
