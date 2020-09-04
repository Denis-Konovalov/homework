package ru.x5.homework4;

import ru.x5.Service;

/*4. Ввести целое число в консоли.
Если оно является положительным, то прибавить к нему 1;
если отрицательным, то вычесть из него 2;
если нулевым, то заменить его на 10.
Вывести полученное число.*/

public class Main {
    public static void main(String[] args) {
        Service.checkArray(args, 1);
        String str = args[0];
        System.out.println("Исходные данные: " + str);
        Service.isNumeric(str);
        int val = Integer.parseInt(str);
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
