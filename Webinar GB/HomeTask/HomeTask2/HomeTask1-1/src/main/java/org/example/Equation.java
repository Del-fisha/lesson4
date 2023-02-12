//4 Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
//могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
//восстановить выражение до верного равенства. Предложить хотя бы
//одно решение или сообщить, что его нет.
package org.example;
import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        int num1, num2, num3;
        System.out.println("Уравнение X + Y = Z, где каждое число положительное двузначное число.\n" +
                "Введите цифры, чтобы в первом числе Вами был введён десяток, во втором единицы:");
        Scanner input = new Scanner(System.in);
        System.out.println("Число Х: ");
        num1 = input.nextInt();
        System.out.println("Число Х: " + num1 + "?");
        System.out.println("Число Y: ");
        num2 = input.nextInt();
        System.out.println("Число Y: " + "?" + num2);
        System.out.println("Равенство: ");
        num3 = input.nextInt();
        System.out.println("Ваше уравнение приняло вид: " + num1 + "? + " + "?" + num2 + " = " + num3);
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                if((num1*10+x)+((y*10)+num2)==num3) System.out.println("Первое число: " + x + "\nВторое чисто: " + y);
            }

        }

    }
}
