//Дано два числа, например 3 и 56,
// необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
package org.example;

public class Fourth {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder sum = new StringBuilder();
        StringBuilder diff = new StringBuilder();
        StringBuilder mult = new StringBuilder();

        sum
                .append(a)
                .append(" + ")
                .append(b)
                .append(" = ")
                .append(a + b);
        diff
                .append(a)
                .append(" - ")
                .append(b)
                .append(" = ")
                .append(a - b);
        mult
                .append(a)
                .append(" * ")
                .append(b)
                .append(" = ")
                .append(a * b);
        System.out.println(diff);
    }
}
