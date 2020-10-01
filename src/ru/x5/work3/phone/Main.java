package ru.x5.work3.phone;

public class Main {
    public static void main(String[] args) {
        Phone phoneNull = new Phone();
        Phone phoneNokia = new Phone("+7(999)777-43-23", "Nokia");
        Phone phoneLG = new Phone("81230982323", "LG", 1.23);
        Phone[] phones = {phoneNull, phoneNokia, phoneLG};
        String[] names = {"Вася", "Таня", "Петя"};
        String[] numbers = {"123", "+7(999)777-43-23", "81230982323"};
        for (Phone phone : phones) {
            System.out.println("Number - " + phone.getNumber() + ", Model - " + phone.getModel() + ", Weight - " + phone.getNumber());
        }
        for (int i = 0; i < phones.length; i++) {
            phones[i].receiveCall(names[i]);
            System.out.println(phones[i].getNumber());
        }
        for (int i = 0; i < phones.length; i++) {
            phones[i].receiveCall(names[i], names[i]);
        }
        phoneNull.sendMessage(numbers);
    }


}
