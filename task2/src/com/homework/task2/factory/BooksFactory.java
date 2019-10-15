package com.homework.task2.factory;

import com.homework.task2.exception.TypeNotCorrectException;
import com.homework.task2.library.*;
import org.apache.log4j.Logger;

public  class BooksFactory {
    static Logger logger = Logger.getLogger(BooksFactory.class);


    public static Book createBooks(String[] line) {
        int pages;
        int dateOfPublication;
        String type = line[0];
        BookType bookType;
        Book book = null;

        try {
            logger.debug("Checking the type of book");
            bookType = BookType.valueOf(type);

            switch (bookType) {
                case Fiction:
                    logger.debug("It is fiction book");
                    book = new Fiction();
                    book.setType(bookType);
                    book.setName(line[1]);
                    pages = Integer.parseInt(line[2]);
                    book.setPages(pages);
                    dateOfPublication = Integer.parseInt(line[3]);
                    book.setYear(dateOfPublication);
                    ((Fiction)book).setGenre(line[4]);
                    ((Fiction)book).setAuthor(line[5]);
                    break;

                case Tutorial:
                    logger.debug("It is tutorial book");
                    book = new Tutorial();
                    book.setType(bookType);
                    book.setName(line[1]);
                    pages = Integer.parseInt(line[2]);
                    book.setPages(pages);
                    dateOfPublication = Integer.parseInt(line[3]);
                    book.setYear(dateOfPublication);
                    int schoolClass = Integer.parseInt(line[4]);
                    ((Tutorial)book).setSchoolClass(schoolClass);
                    ((Tutorial)book).setSubject(line[5]);
                    break;

                case Science:
                    logger.debug("It is science book");
                    book = new Science();
                    book.setType(bookType);
                    book.setName(line[1]);
                    pages = Integer.parseInt(line[2]);
                    book.setPages(pages);
                    dateOfPublication = Integer.parseInt(line[3]);
                    book.setYear(dateOfPublication);
                    ((Science)book).setBranchOfScience(line[4]);
                    ((Science)book).setAuthor(line[5]);
                    break;
            }
        } catch (IllegalArgumentException e) {
            logger.error("!!!!! "+type + " type of book is incorrect!!!!!");
        }

        logger.info("--Book was created--");
        return book;
    }
}