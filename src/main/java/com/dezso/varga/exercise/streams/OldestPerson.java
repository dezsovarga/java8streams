package com.dezso.varga.exercise.streams;

import java.util.Comparator;
import java.util.List;

public class OldestPerson {

    public static Person getOldestPerson7(List<Person> persons) {

        Person oldestPerson = new Person("", 0);
        for (Person person: persons) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    public static Person getOldestPerson(List<Person> persons) {

        return persons.stream()
                .max(Comparator.comparing(Person::getAge)) //p -> p.getAge()
                .get();
    }
}
