package com.homework.task2.validator;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ListValidator {
    static Logger logger = Logger.getLogger(ListValidator.class);

    private static final String VALID_LINE_TUTORIAL="^([a-zA-Zа-яА-Я]+(;\\s+)){1}([a-zA-Zа-яА-Я]+.+(\\s+)){1}(\\d+(;\\s+)){3}([a-zA-Zа-яА-Я]+.+(;\\s+|$)){1}";
    private static final String VALID_LINE = "^([a-zA-Zа-яА-Я]+(;\\s+)){1}([a-zA-Zа-яА-Я]+.+(\\s+)){1}(\\d+(;\\s+)){2}([a-zA-Zа-яА-Я]+.+(;\\s+|$)){2}";

    public static boolean isValid(String line) {
        logger.debug("Checking string line");
        return line!=null && !line.isEmpty() && line.matches(VALID_LINE)|line.matches(VALID_LINE_TUTORIAL);
    }

    public static List<String> verifyList(List<String> listFromFile) {
        List<String> listOfValidLines = new ArrayList<>();

        logger.debug("Reading each line from list for validation");
        for (String lines : listFromFile) {
            if (isValid(lines)) {
                logger.debug("Adding valid line to new valid List");
                listOfValidLines.add(lines);
            }
        }

        logger.info("List was validated successfully");
        return listOfValidLines;
    }
}