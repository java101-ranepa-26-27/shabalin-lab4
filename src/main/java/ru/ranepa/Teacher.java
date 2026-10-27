package ru.ranepa;

public class Teacher extends Person{
    private final Subject subject;

    public Teacher(long id, String name, Subject subject) {
        super(id, name);
        this.subject = subject;
    }

    public String report() {
        return "Преподаватель " + getName() + " (№" + getId() + "): " + subject;
    }
}
