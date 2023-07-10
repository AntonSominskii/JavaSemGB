// Задание:
//        1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        2. Создать множество ноутбуков.
//        3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
//        ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
//        соответствующую необходимому критерию:
//
//        1 - ОЗУ
//
//        2 - Объем ЖД
//
//        3 - Операционная система
//
//        4 - Цвет …
//
//        - Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно
//        также в Map.
//        - Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(16, 512, "Windows", "Черный"));
        laptops.add(new Laptop(8, 256, "Mac OS", "Белый"));
        laptops.add(new Laptop(32, 1024, "Linux", "Серый"));

        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "ОЗУ");
        criteria.put(2, "Объем ЖД");
        criteria.put(3, "Операционная система");
        criteria.put(4, "Цвет");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, соответствующее требуемому критерию:");
        for (Map.Entry<Integer, String> entry : criteria.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        int chosenCriterion = scanner.nextInt();
        System.out.println("Введите минимальное значение для выбранного критерия:");
        String minValue = scanner.next();

        List<Laptop> filteredLaptops;
        switch (chosenCriterion) {
            case 1:
                filteredLaptops = laptops.stream()
                        .filter(laptop -> laptop.getRam() >= Integer.parseInt(minValue))
                        .collect(Collectors.toList());
                break;
            case 2:
                filteredLaptops = laptops.stream()
                        .filter(laptop -> laptop.getStorage() >= Integer.parseInt(minValue))
                        .collect(Collectors.toList());
                break;
            case 3:
                filteredLaptops = laptops.stream()
                        .filter(laptop -> laptop.getOperatingSystem().equalsIgnoreCase(minValue))
                        .collect(Collectors.toList());
                break;
            case 4:
                filteredLaptops = laptops.stream()
                        .filter(laptop -> laptop.getColor().equalsIgnoreCase(minValue))
                        .collect(Collectors.toList());
                break;
            default:
                throw new IllegalArgumentException("Выбран недопустимый критерий");
        }

        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }
}