//3. Реализовать простой калькулятор
package org.example;
import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите простое действие для чисел (+,-,* или /): ");
        String chr = scanner.next();
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();
        if (Objects.equals(chr, "+")) sum(number1, number2);
        else if (Objects.equals(chr, "-")) diff(number1, number2);
        else if (Objects.equals(chr, "*")) multiplication(number1, number2);
        else if (Objects.equals(chr, "/")) quot(number1, number2);
        else System.out.println("Вы ввели неверное значение!");
    }
    static void sum(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }
    static void diff(int num1, int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
    }
    static void quot(int num1, int num2){
        System.out.println(num1 + " : " + num2 + " = " + (num1/num2));
    }
    static void multiplication(int num1, int num2){
        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
    }
}
