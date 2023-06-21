// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены
// знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы
// одно решение или сообщить, что его нет.

public class Main {

    public static void main(String[] args) {
        System.out.println(solveEquation("? + 5 = 69"));
        System.out.println(solveEquation("2 + ? = 69"));
        System.out.println(solveEquation("2 + 5 = ?"));
        System.out.println(solveEquation("? + ? = 69"));
    }

    public static String solveEquation(String equation) {
        String[] parts = equation.split(" ");

        if (parts[0].equals("?")) {
            if (parts[2].equals("?")) {
                return "Ошибка: Несколько вопросительных знаков";
            } else {
                int w = Integer.parseInt(parts[2]);
                int e = Integer.parseInt(parts[4]);
                int q = e - w;
                return q + " + " + w + " = " + e;
            }
        } else if (parts[2].equals("?")) {
            int q = Integer.parseInt(parts[0]);
            int e = Integer.parseInt(parts[4]);
            int w = e - q;
            return q + " + " + w + " = " + e;
        } else if (parts[4].equals("?")) {
            int q = Integer.parseInt(parts[0]);
            int w = Integer.parseInt(parts[2]);
            int e = q + w;
            return q + " + " + w + " = " + e;
        } else {
            return "Ошибка: Нет вопросительного знака";
        }
    }
}
