package ru.x5.work4.homework1;

import static java.lang.Math.sqrt;

public class Triangle implements Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean validation() {
        if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
            System.out.println("Треугольник не существует!");
            return false;
        }
        return true;
    }

    @Override
    public String square() {
        if (!validation()) {
            return "-";
        }
        double p = (a + b + c) / 2;
        double s = sqrt(p * (p - a) * (p - b) * (p - c));

        return "Треугольник - " + s;
    }
}
