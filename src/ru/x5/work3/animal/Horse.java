package ru.x5.work3.animal;

/*
+ Dog, Cat, Horse переопределяют методы makeNoise, eat.
+ Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.

Cat, Dog, Horse – не вижу инициализации уникальных полей, предлагаю добавить конструктор.
*/

public class Horse extends Animal {
    private double speed;

    Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржот");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }
}
