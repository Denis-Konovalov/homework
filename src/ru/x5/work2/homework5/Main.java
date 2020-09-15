package ru.x5.work2.homework5;
/*5. Ввести три целых числа с консоли. Вывести на экран наименьшее из них.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Введите целое число №%d: \n", i + 1);
            array[i] = in.nextInt();
        }
        in.close();
        System.out.println("Исходные данные:");
        int val = array[0];
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + ") " + array[i]);
            if (val > array[i]) {
                val = array[i];
            }
        }
        System.out.println("Результат: " + val);
    }
}
