package ru.x5.work3.phone;

public class Phone {
    String number;
    String model;
    Double weight;

    Phone() {
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(String number, String model, Double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        this.receiveCall(name);
    }

    public void sendMessage(String[] numbers) {
        for (String val : numbers) {
            System.out.println(val);
        }

    }


}
