package com.homework.task2.factory;

import com.homework.task2.library.Book;
import com.homework.task2.library.Tutorial;
import org.apache.log4j.Logger;

public class TutorialFactory extends BooksFactory {
    static Logger logger = Logger.getLogger(TutorialFactory.class);

    public Book createOtherBooks(String[] line) {
        Tutorial tutorialBook = new Tutorial();

        logger.debug("Adding tutorial features");
        int schoolClass = Integer.parseInt(line[4]);
        tutorialBook.setSchoolClass(schoolClass);
        tutorialBook.setSubject(line[5]);

        logger.info("Tutorial features were added");
        return tutorialBook;
    }
}
