package ru.x5.work3.student;

/*
Класс Student содержит переменные: String firstName, lastName, group. А также double averageMark, содержащую среднюю оценку.
Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
Если средняя оценка студента равна 5, то сумма 100, иначе 80.

Student: Поля должны быть с модификатором доступа и инициализироваться через конструктор.
*/

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private static double averageMark; //средняя оценка

    Student(String firstName,String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public static double getAverageMark(){
        return averageMark;
    }

    public double getScholarship() {
        if (this.averageMark == 5) {
            return 100;
        }
        return 80;
    }
}
