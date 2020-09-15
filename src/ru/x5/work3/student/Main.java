package ru.x5.work3.student;

/*
+ Создать переменную типа Student, которая ссылается на объект типа Aspirant.
+ Создать массив типа Student, содержащий объекты класса Student и Aspirant.
+ Вызвать метод getScholarship() для каждого элемента массива.
*/

public class Main {
    public static void main(String[] args) {
        Student aspirant = new Aspirant();
        Student[] students = {new Student(), new Aspirant()};
        for (Student stud : students) {
            stud.getScholarship();
        }
    }
}
