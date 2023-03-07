//Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
package org.example;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите основную строку: ");
        String first = scan.nextLine();
        System.out.println("Введите подстроку: ");
        String second = scan.nextLine();

        if(second.contains(first)) {System.out.println("Подстрока содержится в строке!");}
        else {System.out.println("Подстрока НЕ содержится в строке!");}
    }
}
