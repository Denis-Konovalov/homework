package ru.x5.homework8;

/*8. Дан массив целых чисел: [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного массива найти и вывести на экран:
 - максимальное значение
 - сумму положительных элементов
 - сумму четных отрицательных элементов
 - количество положительных элементов
 - среднее арифметическое отрицательных элементов*/

public class Main {
    public static void main(String[] args) {
        int[] input = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        System.out.println("- максимальное значение = " + maximum(input));
        System.out.println("- сумма положительных элементов = " + sumOfPositive(input));
        System.out.println("- сумму четных отрицательных элементов = " + sumOfEvenNegative(input));
        System.out.println("- количество положительных элементов = " + numberOfPositive(input));
        System.out.println("- среднее арифметическое отрицательных элементов = " + averageOfNegative(input));
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int sumOfPositive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int sumOfEvenNegative(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (array[i] % 2 == 0) {
                    sum += array[i];
                }
            }
        }
        return sum;
    }

    public static int numberOfPositive(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                num++;
            }
        }
        return num;
    }

    public static float averageOfNegative(int[] array) {
        int sum = 0;
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
                quantity++;
            }
        }
        return (float) sum / quantity;
    }
}
