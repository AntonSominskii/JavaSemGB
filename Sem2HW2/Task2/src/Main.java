// 2. К калькулятору из предыдущего дз добавить логирование.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static String LOG_PATH = "CalculatorLog.txt";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первый номер: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите один из операторов: +, -, *, /: ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите втрой номер: ");
        double num2 = scanner.nextDouble();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_PATH, true))) {
            writer.append("Данные ввода: " + num1 + " " + operator + " " + num2 + "\n" + "Результат: ");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в лог-файл.");
            e.printStackTrace();
        }

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
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_PATH, true))) {
                        writer.append("Ошибка! Деление на ноль запрещено." + "\n");
                    } catch (IOException e) {
                        System.out.println("Произошла ошибка при записи в лог-файл.");
                        e.printStackTrace();
                    }
                    return;
                }
            }
            default -> {
                System.out.println("Ошибка! Неверный оператор. Правильные обозначения операторов: +, -, *, /.");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_PATH, true))) {
                    writer.append("Ошибка! Неверный оператор. Правильные обозначения операторов: +, -, *, /." + "\n");
                } catch (IOException e) {
                    System.out.println("Произошла ошибка при записи в лог-файл.");
                    e.printStackTrace();
                }
                return;
            }
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_PATH, true))) {
            writer.append(num1 + " " + operator + " " + num2 + " = " + output + "\n");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в лог-файл.");
            e.printStackTrace();
        }
    }
}