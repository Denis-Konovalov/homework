package ru.x5;

public class Service {
    public static void checkArray(String[] array) {
        if (array == null) {
            System.out.println("Отсутствуют исходные данные!");
            System.exit(1);
        }
        if (array.length == 0) {
            System.out.println("Массив входных данных пуст!");
            System.exit(1);
        }
        if (array.length > 1) {
            System.out.println("Задано больше одного числа!");
            System.exit(1);
        }
    }

    public static void isNumeric(String strNum) {
        try {
            Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            System.out.println("Строка не является целым числом!");
            System.exit(1);
        }
    }
}
