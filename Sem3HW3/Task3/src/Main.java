// Пусть дан произвольный список целых чисел.
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));

        System.out.println("Список до удаления целых чисел: " + list);

        list.removeIf(n -> n % 2 == 0); // удаляем целые числа

        System.out.println("Список после удаления целых чисел: " + list);

        if (!list.isEmpty()) { // проверяем список на заполненность
            Integer min = Collections.min(list);
            System.out.println("Минимальное значение: " + min);

            Integer max = Collections.max(list);
            System.out.println("Максимальное значение: " + max);

            Double average = list.stream().mapToInt(i -> i).average().orElse(Double.NaN);
            System.out.println("Среднее значение: " + average);
        } else {
            System.out.println("Список пуст после удаления целых чисел");
        }
    }
}
