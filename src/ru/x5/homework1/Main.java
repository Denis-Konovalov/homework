package ru.x5.homework1;

/*1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.*/

import ru.x5.Service;

public class Main {
    public static void main(String[] args) {
        Service.checkArray(args);
        String str = args[0];
        System.out.println("Исходные данные: " + str);
        Service.isNumeric(str);
        System.out.println("Последняя цифра: " + str.charAt(str.length() - 1));
    }
}

