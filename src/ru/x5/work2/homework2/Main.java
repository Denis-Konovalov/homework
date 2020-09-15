package ru.x5.work2.homework2;

/*2. Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа*/

import ru.x5.work2.Service;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите трехзначное число:");
        int val = Service.scan();
        System.out.println("Исходные данные: " + val);
        String str = Integer.toString(val);
        checkLengthString(str, 3);
        char[] chars = str.toCharArray();
        val = 0;
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
