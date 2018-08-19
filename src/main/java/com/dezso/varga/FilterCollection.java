package com.dezso.varga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCollection {

    public static List<String> transform7(List<String> collection) {

        List<String> filteredCollection = new ArrayList<>();
        for (String elem: collection) {
            if (elem.length()<4) {
                filteredCollection.add(elem);
            }
        }
        return filteredCollection;
    }

    public static List<String> transform(List<String> collection) {

        return collection.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toList());

    }
}
