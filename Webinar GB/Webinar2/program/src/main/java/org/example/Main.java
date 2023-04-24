//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
package org.example;

import java.lang.reflect.Type;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        String c1 = "c1";
        String c2 = "c2";
        System.out.println(name2(n,c1,c2));
    }

    public static String name(int k, String a, String b) {
        String[] arr = new String[k];
        for (int i = 0; i < k; i++) {
            arr[i] = i % 2 == 0 ? a : b;

        }
        return String.join("",arr);
    }

    public static StringBuilder name2(int k, String a, String b) {
        StringBuilder myString = new StringBuilder();
        for (int i = 0; myString.length() < k ; i++) {
            myString.append(i % 2 == 0 ? a : b);
        }
        return myString;
    }
}