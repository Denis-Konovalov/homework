package ru.x5.work4.homework1;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(3,4,5);
        shape[1] = new Circle(7);
        shape[2] = new Rectangle(5, 7);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }
}
