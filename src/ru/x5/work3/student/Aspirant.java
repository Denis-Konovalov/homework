package ru.x5.work3.student;

/*
+ аспирант отличается от студента наличием некой научной работы.
+ Переопределить этот метод в классе Aspirant.
+ Если средняя оценка аспиранта равна 5, то сумма 200, иначе 180.
*/

public class Aspirant extends Student {
    String nameScientificWork;

    @Override
    public double getScholarship() {
        if (this.averageMark == 5) {
            return 200;
        }
        return 180;

    }
}
