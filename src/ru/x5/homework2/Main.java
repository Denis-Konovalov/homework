package ru.x5.homework2;

/*2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа*/

import ru.x5.Service;

public class Main {
    public static void main(String[] args) {
        Service.checkArray(args);
        String str = args[0];
        System.out.println("Исходные данные: " + str);
        checkLengthString(str, 3);
        Service.isNumeric(str);
        char[] chars = str.toCharArray();
        int val = 0;
        for (char c : chars) {
            val += Character.getNumericValue(c);
        }
        System.out.println("Сумма цифр: " + val);
    }

    public static void checkLengthString(String string, int i) {
        if (string.length() > i) {
            System.out.println("Задано больше " + i + " символов!");
            System.exit(1);
        }
        if (string.length() < i) {
            System.out.println("Задано меньше " + i + " символов!");
            System.exit(1);
        }
    }
}
