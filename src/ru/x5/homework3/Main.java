package ru.x5.homework3;

/*3. Ввести целое число в консоли.
Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его.
Вывести полученное число.*/

import ru.x5.Service;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        int val = Service.scan();
        System.out.println("Исходные данные: " + val);
        if (val > 0) {
            val++;
        }
        System.out.println("Результат: " + val);
    }
}
