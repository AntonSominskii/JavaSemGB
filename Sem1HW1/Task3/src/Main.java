// 3) Реализовать простой калькулятор

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первый номер: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите один из операторов: +, -, *, /: ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите втрой номер: ");
        double num2 = scanner.nextDouble();

        scanner.close();

        double output;

        switch (operator) {
            case '+' -> output = num1 + num2;
            case '-' -> output = num1 - num2;
            case '*' -> output = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    output = num1 / num2;
                } else {
                    System.out.println("Ошибка! Деление на ноль запрещено.");
                    return;
                }
            }
            default -> {
                System.out.println("Ошибка! Неверный оператор. Правильные обозначения операторов: +, -, *, /.");
                return;
            }
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
    }
}
