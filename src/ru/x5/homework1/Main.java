package ru.x5.homework1;

/*1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.*/

public class Main {
    public static void main(String[] args) {
        checkArray(args);
        String str = args[0];
        System.out.println("Исходные данные: " + str);
        isNumeric(str);
        System.out.println("Последняя цифра: " + str.charAt(str.length() - 1));
    }

    private static void checkArray(String[] array) {
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

    private static void isNumeric(String strNum) {
        try {
            long l = Long.parseLong(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            System.out.println("Строка не является целым числом!");
            System.exit(1);
        }
    }
}

