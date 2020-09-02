package ru.x5.homework2;

/*2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа*/

public class Main {
    public static void main(String[] args) {
        checkArray(args);
        String str = args[0];
        System.out.println("Исходные данные: " + str);
        checkString(str);
        isNumeric(str);
        char[] chars = str.toCharArray();
        int val = 0;
        for (char c : chars) {
            val += Character.getNumericValue(c);
        }
        System.out.println("Сумма цифр: "+val);
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

    public static void checkString(String string) {
        if (string.length() > 3) {
            System.out.println("Задано больше трех символов!");
            System.exit(1);
        }
        if (string.length() < 3) {
            System.out.println("Задано меньше трех символов!");
            System.exit(1);
        }
    }

    private static void isNumeric(String strNum) {
        try {
            short s = Short.parseShort(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            System.out.println("Строка не является целым числом!");
            System.exit(1);
        }
    }
}
