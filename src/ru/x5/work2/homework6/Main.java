package ru.x5.work2.homework6;

/*6. Ввести целое число в консоли.
Вывести его строку-описание вида «отрицательное четное число», «нулевое число»,  «положительное нечетное число» и т. д.*/

import ru.x5.work2.Service;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        int val = Service.scan();
        System.out.println("Исходные данные: " + val);
        String str = "";
        if (val < 0) {
            str = "отрицательное";
        } else {
            str = "положительное" + isSimple(val);
        }
        if (val % 2 == 0) {
            str = str + " четное";
        } else {
            str = str + " нечетное";
        }
        if (val == 0) {
            str = "нулевое";
        }
        str = str + " число";
        System.out.println(str);
    }

    //нахождение простого числа
    private static String isSimple(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return "";
            }
        }
        return " простое";
    }
}
