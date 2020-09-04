package ru.x5.homework5;


/*5. Ввести три целых числа с консоли. Вывести на экран наименьшее из них.*/

import ru.x5.Service;

public class Main {
    public static void main(String[] args) {
        Service.checkArray(args, 3);
        for (int i = 0; i < 3; i++) {
            Service.isNumeric(args[i]);
        }
        System.out.println("Исходные данные:");
        int val = Integer.parseInt(args[0]);
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + ") " + args[i]);
            if (val > Integer.parseInt(args[i])) {
                val = Integer.parseInt(args[i]);
            }
        }
        System.out.println("Результат: " + val);
    }
}
