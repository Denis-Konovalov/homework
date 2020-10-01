package ru.x5.work4.homework1;

public class Rectangle implements Shape {
    private double a, b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String square() {
        return "Прямоугольник - " + a * b;
    }
}
