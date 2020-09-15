package ru.x5.work3.animal;

/*
+ Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
+ Пусть этот метод распечатывает food и location пришедшего на прием животного.
*/

public class Veterinarian {
    void treatAnimal(Animal animal) {
        System.out.println("Еда: " + animal.food);
        System.out.println("Локация: " + animal.location);
    }
}
