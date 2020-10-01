package ru.x5.work4.homework1;

public class Circle implements Shape {
    private double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public String square() {
        return "Круг - " + 3.14 * (r * r);
    }
}
