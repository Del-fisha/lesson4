package org.example;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Простые числа: ");
        for (int j = 2; j < 1000; j++) {
            int i = 2;
            while (i < j){
                if(j % i == 0) break;
                i++;
            }
            if(j == i){
                System.out.print(i + ", ");
                i = 0;
            }
        }
    }
}
