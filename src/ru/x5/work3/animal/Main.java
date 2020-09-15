package ru.x5.work3.animal;
/*
+ В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
+ В цикле отправляйте их на прием к ветеринару.
*/
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Horse();
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal: animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
