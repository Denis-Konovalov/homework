package ru.x5.work3.student;

/*
аспирант отличается от студента наличием некой научной работы.
Переопределить этот метод в классе Aspirant.
Если средняя оценка аспиранта равна 5, то сумма 200, иначе 180.

Aspirant: уникальное поле не инцииализируется, нужно так же добавить конструктор
*/

public class Aspirant extends Student {
    private String nameScientificWork;

    Aspirant(String firstName, String lastName, String group, double averageMark, String nameScientificWork) {
        super(firstName, lastName, group, averageMark);
        this.nameScientificWork = nameScientificWork;
    }

    @Override
    public double getScholarship() {
        if (Student.getAverageMark() == 5) {
            return 200;
        }
        return 180;
    }
}
