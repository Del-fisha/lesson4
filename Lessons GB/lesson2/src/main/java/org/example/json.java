package org.example;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class json {
    public static void main(String[] args) throws IOException {
        Logger myLogger = Logger.getLogger(javaRush.class.getName());
        FileHandler fileLog = new FileHandler("log2.txt");
        myLogger.addHandler(fileLog);
        String json = new String("{\"gender\": \"male\",\"minAge\": 18,\"maxAge\": 25}");
        System.out.println(json);
        StringBuilder where = new StringBuilder("where ");
        if(json.get("gender") != null) {
            where.append("gender = '").append(json.get("gender")).append("' and ");
        }
        if(json.get("minAge") != null) {
            where.append("age >= ").append(json.get("minAge")).append(" and ");
        }
        if(json.get("maxAge") != null) {
            where.append("age <= ").append(json.get("maxAge")).append(" and ");
        }
        where.delete(where.length() - 5, where.length());
    }
}
