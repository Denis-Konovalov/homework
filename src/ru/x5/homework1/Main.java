package ru.x5.homework1;

/*1. Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.*/

public class Main {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println("Исходные данные: "+str);
        System.out.println("Последнее число: "+str.charAt(str.length()-1));
    }
}
