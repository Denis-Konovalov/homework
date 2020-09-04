package ru.x5.homework7;

/*7. Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города.
( Москва(905) - 4.15руб. Ростов(194) - 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00руб. ).
Пользователь в консоли должен ввести код города, а в ответ от программы получить, например, при вводе кода 905, - «Москва. Стоимость разговора: 41.5»*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите код города: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();

        switch (num) {
            case 905:
                System.out.println("Москва. Стоимость разговора: 4.15 руб.");
                break;
            case 194:
                System.out.println("Ростов. Стоимость разговора: 1.98 руб.");
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора: 2.69 руб.");
                break;
            case 800:
                System.out.println("Киров. Стоимость разговора: 5.00 руб.");;
                break;
            default:
                System.out.println("Введен не корректный код города, доступны 905, 194, 491, 800.");;
                break;
        }
    }
}
