package org.example;

import java.util.Scanner;
import java.nio.file.Files;
import java.util.logging.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class javaRush {
    public static void main(String[] args) throws IOException {
        Logger myLogger = Logger.getLogger(javaRush.class.getName());
        FileHandler fileLog = new FileHandler("log.txt");
        myLogger.addHandler(fileLog);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String nameOfFile = sc.nextLine();
        System.out.println("Введите расширение файла: ");
        String typeOfFile = sc.nextLine();
        String pathFile = nameOfFile + "." + typeOfFile;
        dirCollection();
        System.out.println(Arrays.toString(dirCollection()));
        writeToFile(dirCollection(), pathFile);
    }
    public static String[] dirCollection(){
        File f1 = new File("D:\\Study\\Java\\Lessons GB\\lesson2\\src\\main\\java\\org\\example");
        String[] pathNames = f1.list();
        return pathNames;
    }
    public static void writeToFile(String[] array, String name) throws IOException {
        try(FileWriter wr = new FileWriter(name)){
            wr.write(Arrays.toString(array));
        }
        catch (Exception e){
            System.out.println("Какая-то ошибка");
        }
        finally {
            System.out.println("Конец обработки");
        }
    }
}
