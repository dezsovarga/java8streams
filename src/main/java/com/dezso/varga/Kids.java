package com.dezso.varga;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Kids {

    public static Set<String> getKidNames7(List<Person> people){
        Set<String> kidsNames = new HashSet<>();
        for (Person person:people) {
            if (person.getAge() <18) {
                kidsNames.add(person.getName());
            }
        }
        return kidsNames;
    }

    public static Set<String> getKidNames(List<Person> people){
        return people.stream()
                .filter(p -> p.getAge() <18)
                .map(s -> s.getName())
                .collect(Collectors.toSet());
    }
}
