package com.dezso.varga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {

    public static List<String> transform7(List<String> collection) {

        List<String> uppercaseCollection = new ArrayList<String>();
        for (String elem:collection) {
            uppercaseCollection.add(elem.toUpperCase());
        }
        return uppercaseCollection;
    }

    public static List<String> transform(List<String> collection) {

        return collection.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

}
