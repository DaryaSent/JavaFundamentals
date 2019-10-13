package com.homework.task2.creator;

import com.homework.task2.exception.TypeNotCorrectException;
import com.homework.task2.factory.FictionFactory;
import com.homework.task2.factory.BooksFactory;
import com.homework.task2.factory.TutorialFactory;
import com.homework.task2.factory.ScienceFactory;
import com.homework.task2.library.Book;
import com.homework.task2.library.BookType;
import com.homework.task2.validator.ListValidator;
import org.apache.log4j.Logger;

public class BooksCreator {
    static Logger logger = Logger.getLogger(BooksCreator.class);

    public Book createBooks(String[] line) {
        String type = line[0];
        BookType bookType;
        BooksFactory booksFactory=null;

        try {
            logger.debug("Checking the type of book");
            bookType = BookType.valueOf(type);
        } catch (IllegalArgumentException e) {
            logger.error(type + " type of book is incorrect");
            throw new TypeNotCorrectException(type + " of plane isn't correct", e);
        }

        switch (bookType) {
            case Fiction:
                logger.debug("It is fiction book");
                booksFactory = new FictionFactory();
                break;

            case Tutorial:
                logger.debug("It is tutorial book");
                booksFactory = new TutorialFactory();
                break;

            case Science:
                logger.debug("It is science book");
                booksFactory = new ScienceFactory();
                break;
        }

        logger.info("Creating book according to the type");
        return booksFactory.createCommonFeatures(line);
    }
}