// 1. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    private static String LOG_PATH = "BubbleSortLog.txt";

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90, -10};
        bubbleSort(array);
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) { // меняем местами array[j+1] и array[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            // результат пишем в лог после каждого прохождения массива
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_PATH, true))) {
                writer.append("Результат после " + (i + 1) + "-го прохождения массива: " + Arrays.toString(array) + "\n");
            } catch (IOException e) {
                System.out.println("Произошла ошибка при записи в лог-файл.");
                e.printStackTrace();
            }
        }
    }
}