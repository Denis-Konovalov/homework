package ru.x5.work2.homework4;

import ru.x5.work2.Service;

/*4. Ввести целое число в консоли.
Если оно является положительным, то прибавить к нему 1;
если отрицательным, то вычесть из него 2;
если нулевым, то заменить его на 10.
Вывести полученное число.*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        int val = Service.scan();
        System.out.println("Исходные данные: " + val);
        if (val > 0) {
            val++;
        }
        if (val < 0) {
            val -= 2;
        }
        if (val == 0) {
            val = 10;
        }
        System.out.println("Результат: " + val);
    }
}
