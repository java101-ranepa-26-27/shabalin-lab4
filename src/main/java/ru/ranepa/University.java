package ru.ranepa;

import java.util.ArrayList;
import java.util.List;

public class University {
    private final List<GradeBook> gradeBooks = new ArrayList<>();
    private long nextId = 1;
    private final Journal journal = new Journal();

    public Student enroll(String name) {
        long id = nextId++;
        GradeBook book = new GradeBook(id);
        Student student = new Student(id, name, book);
        journal.add(student);
        gradeBooks.add(book);
        return student;
    }

    public Teacher hire(String name, String subjectName){
        long id = nextId++;
        Subject subject = new Subject(subjectName);
        Teacher teacher = new Teacher(id, name, subject);
        journal.add(teacher);
        return teacher;
    }
    public Person findId(long id){
        return journal.findId(id);
    }

    public Person findName(String name){
        return journal.findName(name);
    }

    public List<Person> all(){
        return journal.all();
    }

    public void grade(long id, int grade) {
        for (GradeBook gradeBook : gradeBooks) {
            if (gradeBook.getStudentId() == id) {
                gradeBook.addGrade(grade);
                return;
            }

            throw new IllegalArgumentException("зачетка не найдена");
        }
    }

    public double average(long id) {
        for (GradeBook book : gradeBooks) {
            if (book.getStudentId() == id) {
                return book.average();
            }
        }
        throw new IllegalArgumentException("зачётка не найдена");
    }
}
