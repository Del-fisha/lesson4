//*1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//
//int i = new Random().nextInt(k); //это кидалка случайных чисел!)

package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i, n;
        n = 2;
        Random random = new Random();
        i = new Random().nextInt(2000);
        n = Integer.toBinaryString(i).length();
        System.out.println("i = " + i);
        System.out.println("n = " + n);
        System.out.println("Short.MAX_VALUE:  " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE: " + Short.MIN_VALUE);

        int[] m1 = new int[(Short.MAX_VALUE - i)/n];
        for (int j = 0; j < m1.length;){
            for(int k = i;k < Short.MAX_VALUE; k++){
                if(k % n == 0) {
                    m1[j] = k;
                    j++;
                }
                }
            }
        System.out.println("\nВсе кратные n числа в диапазоне от i до Short.MAX_VALUE в массиве:");
        System.out.println(Arrays.toString(m1));

        int[] m2 = new int[(i - Short.MIN_VALUE)-((i - Short.MIN_VALUE)/n)];
        for (int j = 0; j < m2.length;){
            for(int k = i;k > Short.MIN_VALUE; k--){
                if(k % n != 0) {
                    m2[j] = k;
                    j++;
                }
            }
        }
        System.out.println("Все некратные n числа в диапазоне от Short.MIN_VALUE до i в массиве:");
        System.out.println(Arrays.toString(m2));

        }
    }
