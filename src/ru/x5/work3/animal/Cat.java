package ru.x5.work3.animal;

/*
+ Dog, Cat, Horse переопределяют методы makeNoise, eat.
+ Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
*/

public class Cat extends Animal {
    private String colour;

    Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяучит");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }

}
