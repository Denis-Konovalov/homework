package ru.x5.work3.phone;

/*
Задание 1: Почему поля и конструкторы без модификаторов доступа?
Конструктор Phone() предлагаю заполнить какими-то значениями по умолчанию.
*/

public class Phone {
    private String number;
    private String model;
    private Double weight;

    public Phone() {
        this.number = "+79998001122";
        this.model = "Samsung";
        this.weight = 0.12;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, Double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
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
