package com.dezso.varga.exercise.streams;

import java.util.IntSummaryStatistics;
import java.util.List;

public class PeopleStats {

    public static Stats getStat7(List<Person> people) {

        int sum = 0;
        int max = 0;
        int min = people.get(0).getAge();
        int count = people.size();
        int age;
        for (Person p:people) {
            age = p.getAge();
            sum += age;
            max = Math.max(max, age);
            min = Math.min(min, age);
        }
        return new Stats(count,(double)sum/count, min, max, sum);
    }

    public static IntSummaryStatistics getStats(List<Person> people) {

        return people.stream()
                .mapToInt(Person::getAge)
                .summaryStatistics();
    }
}
