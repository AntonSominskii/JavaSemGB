//Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
//        1) Умножьте два числа и верните произведение в виде связанного списка.
//        2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.
//        3)*Реализовать стэк с помощью массива. Нужно реализовать методы:
//        size(), empty(), push(), peek(), pop().

import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static LinkedList<Integer> multiply(Deque<Integer> deque1, Deque<Integer> deque2) {
        int num1 = 0;
        int num2 = 0;
        int multiplier = 1;

        while (!deque1.isEmpty()) {
            num1 += deque1.removeLast() * multiplier;
            multiplier *= 10;
        }

        multiplier = 1;

        while (!deque2.isEmpty()) {
            num2 += deque2.removeLast() * multiplier;
            multiplier *= 10;
        }

        int product = num1 * num2;

        LinkedList<Integer> result = new LinkedList<>();
        while (product > 0) {
            result.addFirst(product % 10);
            product /= 10;
        }

        return result;
    }

    public static LinkedList<Integer> add(Deque<Integer> deque1, Deque<Integer> deque2) {
        int num1 = 0;
        int num2 = 0;
        int multiplier = 1;

        while (!deque1.isEmpty()) {
            num1 += deque1.removeLast() * multiplier;
            multiplier *= 10;
        }

        multiplier = 1;

        while (!deque2.isEmpty()) {
            num2 -= deque2.removeLast() * multiplier;
            multiplier *= 10;
        }

        int sum = num1 + num2;

        LinkedList<Integer> result = new LinkedList<>();
        while (sum != 0) {
            result.addFirst(Math.abs(sum % 10));
            sum /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        // Проверяем работу метода multiply
        Deque<Integer> deque1 = new LinkedList<>();
        deque1.add(2);
        deque1.add(3);
        Deque<Integer> deque2 = new LinkedList<>();
        deque2.add(3);
        deque2.add(4);
        LinkedList<Integer> multiplyResult = multiply(deque1, deque2);
        System.out.println("Результат умножения: " + multiplyResult);

        // Проверяем работу метода add
        Deque<Integer> deque3 = new LinkedList<>();
        deque3.add(3);
        deque3.add(4);
        Deque<Integer> deque4 = new LinkedList<>();
        deque4.add(2);
        deque4.add(5);
        LinkedList<Integer> addResult = add(deque3, deque4);
        System.out.println("Результат сложения: " + addResult);

        // Проверяем работу класса Stack
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Размер стэка: " + stack.size());
        System.out.println("Верхний элемент стэка: " + stack.peek());
        System.out.println("Удаленный верхний элемент стэка: " + stack.pop());
        System.out.println("Верхний элемент стэка, после удаления: " + stack.peek());
    }
}