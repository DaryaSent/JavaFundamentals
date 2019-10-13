package com.homework.task2.factory;

import com.homework.task2.creator.BooksCreator;
import com.homework.task2.library.Book;
import com.homework.task2.library.BookType;
import org.apache.log4j.Logger;

public abstract class BooksFactory {
    static Logger logger = Logger.getLogger(BooksFactory.class);

    public  Book createCommonFeatures(String[] line) {
        logger.debug("Create features of book from each element of line");
        Book book = createOtherBooks(line);

        logger.debug("Adding common features");
        String type = line[0];
        BookType bookType = BookType.valueOf(type);
        book.setType(bookType);

        book.setName(line[1]);

        int pages = Integer.parseInt(line[2]);
        book.setPages(pages);

        int dateOfPublication = Integer.parseInt(line[3]);
        book.setYear(dateOfPublication);

        logger.info("Common features were added");
        return book;
    }

    public abstract Book createOtherBooks(String[] line);
}
