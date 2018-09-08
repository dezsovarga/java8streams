package com.dezso.varga.exercise.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

public class Partitioning {

    public static Map<Boolean, List<Person>> partitionAdults7(List<Person> people) {
        Map<Boolean, List<Person>> partitions = new HashMap<>();
        /*List<Person> adults  = new ArrayList<>();
        List<Person> kids = new ArrayList<>();
        for (Person p:people) {
            if (p.getAge() >=18) {
                adults.add(p);
            }
            else {
                kids.add(p);
            }
        }
        partitions.put(true, adults);
        partitions.put(false, kids);
        */

        partitions.put(true, new ArrayList<>());
        partitions.put(false, new ArrayList<>());
        for (Person p:people) {
            partitions.get(p.getAge() >=18).add(p);
        }

        return partitions;
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream()
                .collect(partitioningBy(p -> p.getAge() >=18));
    }
}
