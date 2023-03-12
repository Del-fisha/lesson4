//  *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

package org.example;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку для переворота (НЕ государственного): ");
        String builder = new String(scan.nextLine());
        System.out.println(recurse(builder));

    }

    public static String recurse(String str){
        if(str == "") return str;
        else return(recurse(str.substring(1))+ str.charAt(0));
    }
}
