package ru.ranepa;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<Person> people = new ArrayList<>();

    public void add(Person person){
        people.add(person);
    }

    public List<Person> all(){
        return new ArrayList<>(people);
    }

    public Person findId(long id){
        for (Person person : people) {
            if (person.getId() == id);
            return person;
        }
    }

}
