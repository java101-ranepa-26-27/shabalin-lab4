package ru.ranepa;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Student anna = university.enroll("Анна");

        Teacher viktor = university.hire("Виктор", "история");
        Student boris = university.enroll("Борис");
        System.out.println(anna.report());

        university.grade(anna.getId(), 3);
        university.grade(anna.getId(), 4);
        university.grade(anna.getId(), 5);

        for (Person person : university.all()) {
            System.out.println(person.report());
        }
        try{
            university.grade(viktor.getId(), 5);
        } catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }

        Person foundViktor = university.findName("Виктор");
        System.out.println(foundViktor.report());

        try{
            university.findName("Иван");
        } catch(IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println(university.average(anna.getId()));


        // 1. принять преподавателя
        // 2. поставить Анне оценки
        // 3. напечатать всех одним циклом
        // 4. попробовать оценить преподавателя — отказ
        // 5. найти человека по имени
        // 6. напечатать средний балл
    }
}
