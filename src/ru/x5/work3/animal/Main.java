package ru.x5.work3.animal;

/*
+ В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
+ В цикле отправляйте их на прием к ветеринару.
*/
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Рыба","Коробка"), new Dog("Кость","Будка"), new Horse("Трава","Стойло")};
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
