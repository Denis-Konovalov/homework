package ru.x5.homework10;

/*10. Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52].
Переместить нули в конец массива. Вывести результат в консоль*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] output = new int[input.length];
        System.out.println("Исходные данные: \n" + Arrays.toString(input));
        for (int i = 0, j = 0; i < input.length; i++,j++) {
            if (input[i] != 0) {
                output[j] = input[i];
            } else{
                j--;
            }
        }
        System.out.println("Результат: \n"+ Arrays.toString(output));
    }
}
