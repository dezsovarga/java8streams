package com.dezso.varga.exercise.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Grouping {

    public static Map<String, List<Person>> groupByNationality7(List<Person> people) {
        Map<String, List<Person>> map = new HashMap<>();
        String nationality;
        for (Person p : people) {
            if (!map.containsKey(nationality = p.getNationality())) {
                map.put(nationality, new ArrayList<>());
            }
            map.get(nationality).add(p);
        }
        return map;
    }

    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        return people.stream()
                .collect(groupingBy(Person::getNationality));
    }
}
