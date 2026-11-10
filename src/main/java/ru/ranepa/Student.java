package ru.ranepa;

import java.util.List;

public class Student extends Person{
    private final GradeView gradeView;

    public Student(long id, String name, GradeBook gradeView) {
        super(id, name);
        this.gradeView = gradeView;
    }

    public double average() {
        return gradeView.average();
    }

    public String report() {
        List<Integer> grades = gradeView.getGrades();
        return "Студент " + getName() + " (№" + getId() + "): " + grades+ "Средний:" + average();
    }
}
