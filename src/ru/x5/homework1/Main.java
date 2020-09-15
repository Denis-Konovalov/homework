package ru.x5.homework1;

/*1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.*/

import ru.x5.Service;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        int val = Service.scan();
        System.out.println("Исходные данные: " + val);
        String str = Integer.toString(val);
        System.out.println("Последняя цифра: " + str.charAt(str.length() - 1));
    }
}

