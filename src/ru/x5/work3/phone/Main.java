package ru.x5.work3.phone;

public class Main {
    public static void main(String[] args) {
        Phone phoneNull = new Phone();
        Phone phoneNokia = new Phone("+7(999)777-43-23", "Nokia");
        Phone phoneLG = new Phone("81230982323", "LG", 1.23);
        System.out.println("Number - " + phoneNull.number + ", Model - " + phoneNull.model + ", Weight - " + phoneNull.weight);
        System.out.println("Number - " + phoneNokia.number + ", Model - " + phoneNokia.model + ", Weight - " + phoneNokia.weight);
        System.out.println("Number - " + phoneLG.number + ", Model - " + phoneLG.model + ", Weight - " + phoneLG.weight);
        phoneNull.receiveCall("Вася");
        System.out.println(phoneNull.getNumber());
        phoneNokia.receiveCall("Таня");
        System.out.println(phoneNokia.getNumber());
        phoneLG.receiveCall("Петя");
        System.out.println(phoneLG.getNumber());
        phoneNull.receiveCall("Вася", "123");
        phoneLG.receiveCall("Таня", "111");
        phoneNokia.receiveCall("Петя", "222");
        String[] numbers = {"123", "+7(999)777-43-23", "81230982323", "123456789", "89993332233", "7489320"};
        phoneNull.sendMessage(numbers);
    }


}
