// 2) Вывести все простые числа от 1 до 1000

public class Main {
    public static void main(String[] args) {
        printPrimes(1, 1000);
    }

    public static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
