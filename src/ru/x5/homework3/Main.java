package ru.x5.homework3;

/*3. Ввести целое число в консоли.
Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его.
Вывести полученное число.*/

import ru.x5.Service;

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
        System.out.println("Результат: " + val);
    }
}
