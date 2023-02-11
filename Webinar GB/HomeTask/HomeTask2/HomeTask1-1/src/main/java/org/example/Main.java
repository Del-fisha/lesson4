import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int sum = TriangleSum(number), mult = TriangleMult(number);

        if (isTriangular(number)){
            System.out.println("Число " + number + " является треугольным");
            System.out.println("Сумма чисел: " + sum);
            System.out.println("Произведение чисел: " + mult);
        }
        else System.out.println("Число " + number + " НЕ является треугольным");

    }
    static boolean isTriangular(int num) {
        if (num < 0) return false;
        int sum = 0, n = 1;
        for (int i = 1; sum <= num; i++) {
            sum += i;
            if (sum == num) return true;
        }
        return false;
    }
    public static int TriangleSum(int num) {
        if (num == 1) {
            return 1;
        }
        return TriangleSum(num - 1) + num;
    }
    public static int TriangleMult(int num) {
        if (num == 1) {
            return 1;
        }
        return TriangleMult(num - 1) * num;
    }
}

