package ru.x5.work3.student;

/*
+ Класс Student содержит переменные: String firstName, lastName, group. А также double averageMark, содержащую среднюю оценку.
+ Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
+ Если средняя оценка студента равна 5, то сумма 100, иначе 80.
*/

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark; //средняя оценка

    public double getScholarship() {
        if (this.averageMark == 5) {
            return 100;
        }
        return 80;
    }
}
