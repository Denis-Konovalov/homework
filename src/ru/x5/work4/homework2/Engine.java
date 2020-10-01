package ru.x5.work4.homework2;

/*
2. Класс Engine содержит поля - мощность, производитель.
*/

public class Engine {
    private double power;
    private String manufacturer;

    Engine(Double power, String manufacturer){
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public double getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
