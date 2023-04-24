//Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке)

package org.example;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите основную строку: ");
        StringBuilder first = new StringBuilder(scan.nextLine());
        System.out.println("Введите подстроку: ");
        StringBuilder second = new StringBuilder(scan.nextLine()).reverse();


        if(second.indexOf(String.valueOf(first)) == 0) {System.out.println("Вхождение в обратном порядке присутствует!");}
        else {System.out.println("Вхождение в обратном порядке отсутствует!");}
    }
}
