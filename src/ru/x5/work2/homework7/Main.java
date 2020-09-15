package ru.x5.work2.homework7;

/*7. Написать программу, вычисляющую стоимость 10 минутного междугороднего разговора в зависимости от кода города.
( Москва(905) - 4.15руб. Ростов(194) - 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00руб. ).
Пользователь в консоли должен ввести код города, а в ответ от программы получить, например, при вводе кода 905, - «Москва. Стоимость разговора: 41.5»*/

import ru.x5.work2.Service;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите код города: ");
        int time = 10;
        String city = "";
        double cost = 0;
        int num = Service.scan();
        switch (num) {
            case 905:
                city = "Москва";
                cost = 4.15;
                break;
            case 194:
                city = "Ростов";
                cost = 1.98;
                break;
            case 491:
                city = "Краснодар";
                cost = 2.69;
                break;
            case 800:
                city = "Киров";
                cost = 5.00;
                break;
            default:
                System.out.println("Введен не корректный код города, доступны 905, 194, 491, 800.");
                ;
                break;
        }
        if (cost != 0) {
            System.out.println(city + ". Стоимость разговора: " + cost * time + "руб.");
        }
    }
}
