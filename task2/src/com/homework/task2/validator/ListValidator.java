package com.homework.task2.validator;

import org.apache.log4j.Logger;

public class ListValidator {
    static Logger logger = Logger.getLogger(ListValidator.class);

    private static final String VALID_LINE_TUTORIAL="^([a-zA-Zа-яА-Я]+(;\\s+)){1}([a-zA-Zа-яА-Я]+.+(\\s+)){1}(\\d+(;\\s+)){3}([a-zA-Zа-яА-Я]+.+(;\\s+|$)){1}";
    private static final String VALID_LINE = "^([a-zA-Zа-яА-Я]+(;\\s+)){1}([a-zA-Zа-яА-Я]+.+(\\s+)){1}(\\d+(;\\s+)){2}([a-zA-Zа-яА-Я]+.+(;\\s+|$)){2}";

    public static boolean isValid(String line) {
        logger.debug("Checking string line");
        return line!=null && !line.isEmpty() && line.matches(VALID_LINE)|line.matches(VALID_LINE_TUTORIAL);
    }
}
