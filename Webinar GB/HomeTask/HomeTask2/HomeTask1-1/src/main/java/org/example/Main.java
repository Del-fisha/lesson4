//1. Вычислить n-ое треугольного числа(сумма чисел от 1 до n), n!
//(произведение чисел от 1 до n)
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        long sum = TriangleSum(number), mult = TriangleMult(number);

        if (isTriangular(number)){
            System.out.println("Число " + number + " является треугольным");
            System.out.println("Сумма чисел: " + sum);
            System.out.println("Произведение чисел: " + mult);
        }
        else System.out.println("Число " + number + " НЕ является треугольным");

    }
    static boolean isTriangular(int num) { //Функция проверки введённого числа на треугольность
        if (num < 0) return false;
        int sum = 0, n = 1;
        for (int i = 1; sum <= num; i++) {
            sum += i;
            if (sum == num) return true;
        }
        return false;
    }
    public static int TriangleSum(int num) { // Функция поиска суммы чисел до треугольного числа
        if (num == 1) {
            return 1;
        }
        return TriangleSum(num - 1) + num;
    }
    public static int TriangleMult(int num) { // Функция поиска произведения чисел до треугольного числа
        if (num == 1) {
            return 1;
        }
        return TriangleMult(num - 1) * num;
    }
}

