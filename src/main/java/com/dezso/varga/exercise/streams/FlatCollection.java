package com.dezso.varga.exercise.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatCollection {

        public static List<String> transform7(List<List<String>> collection) {

            List<String> flattedCollection = new ArrayList<>();
            for (List<String> listElem: collection) {
                for (String stringElem : listElem) {
                    flattedCollection.add(stringElem);
                }
            }
            return flattedCollection;
        }

        public static List<String> transform(List<List<String>> collection) {

            return collection.stream()
                    .flatMap(List::stream)
                    .collect(Collectors.toList());

        }
}
