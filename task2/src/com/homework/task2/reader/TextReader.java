package com.homework.task2.reader;

import com.homework.task2.exception.TextException;
import com.homework.task2.validator.ListValidator;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextReader {
    static Logger logger = Logger.getLogger(ListValidator.class);

    private List<String> list = new ArrayList<>();
    BufferedReader lineReader;
    String line;

    public List<String> textRead(File file) throws TextException {
        try {
            logger.debug("Reading file");
            lineReader = new BufferedReader(new java.io.FileReader(file));

            if (file.length() == 0) {
                throw new TextException("Файл пуст");
            }

            logger.debug("Reading each line from file");
            while ((line = lineReader.readLine()) != null) {
                logger.debug("Adding lines from file to the List");
                list.add(line);
            }

        } catch(FileNotFoundException e) {
            logger.error("File name "+ file +" is absent");
            throw new TextException("Файл с именем "+ file +" не найден");

        } catch (IOException e) {
            logger.error("Mistake of reading line "+ e);
            throw new TextException("ошибка чтения строки",e);

        } finally {
            try {
                if (lineReader != null) {
                    logger.debug("Stop reading and close reader");
                    lineReader.close();
                }
            } catch (IOException e) {
                logger.error("Mistake while closing "+ e);
                System.out.println("Проблема закрытия");
            }
        }

        logger.info("File was read successfully");
        return list;
    }
}