package ru.x5.work3.student;

/*
Создать переменную типа Student, которая ссылается на объект типа Aspirant.
Создать массив типа Student, содержащий объекты класса Student и Aspirant.
Вызвать метод getScholarship() для каждого элемента массива.
*/

public class Main {
    public static void main(String[] args) {
        Student aspirant = new Aspirant("Иван","Иванов","г-2312",4,"Работа 1");
        Student[] students = {new Student("Олег","Сидоров","0363",5), new Aspirant("Григорий","Петров","а-1234",5,"Работа 1")};
        for (Student stud : students) {
            System.out.println(stud.getScholarship());
        }
    }
}
