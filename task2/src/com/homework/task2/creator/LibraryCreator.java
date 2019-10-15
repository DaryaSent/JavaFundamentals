package com.homework.task2.creator;

import com.homework.task2.factory.BooksFactory;
import com.homework.task2.library.Book;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class LibraryCreator {
    static Logger logger = Logger.getLogger(LibraryCreator.class);

    public static List<Book> createLibrary(List<String> listFromFile) {
        List<Book> library = new ArrayList<>();

        logger.debug("----Creating Book List from lines of valid List----");
        for (String lines : listFromFile) {
            logger.debug("Split line");
            String[] splitLines = lines.split("; +");
            logger.debug("Creating book from line:::  ");
            Book book = new BooksFactory().createBooks(splitLines);
            library.add(book);
        }

        logger.info("----Library of Book List was created successfully----");
        return library;
    }
}
