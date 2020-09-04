package ru.x5.homework9;

/*Дан массив целых чисел: [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
Переставить элементы массива в обратном порядке. Вывести результат в консоль*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] output = input;
        System.out.println("Исходные данные: \n" + Arrays.toString(input));
        for (int i = 0; i < output.length / 2; i++) {
            int tmp = output[i];
            output[i] = output[output.length - i - 1];
            output[output.length - i - 1] = tmp;
        }
        System.out.println("Результат: \n"+Arrays.toString(output));
    }
}
