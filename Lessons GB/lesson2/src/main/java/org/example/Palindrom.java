package org.example;

public class Palindrom {
    public static void main(String[] args) {
        String pal = "erttre";
        System.out.print(isPalindrom(pal));
    }
    public static Boolean isPalindrom(String str){
        int mid = str.length() / 2;
        StringBuilder rigth = new StringBuilder();
        StringBuilder left = new StringBuilder();
        for (int i = 0; i < mid; i++) rigth.append(str.charAt(i));
        for (int j = str.length()-1; j > mid-1; j--) left.append(str.charAt(j));
        if(rigth == left) return true;
        return false;
    }
}
