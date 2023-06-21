// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateTriangularNumber(5));
        System.out.println(calculateFactorial(5));
    }

    public static int calculateTriangularNumber(int n) {
        return n * (n + 1) / 2;
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
