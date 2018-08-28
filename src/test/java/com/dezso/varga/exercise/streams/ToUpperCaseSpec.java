package com.dezso.varga.exercise.streams;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

import java.util.List;

import static com.dezso.varga.exercise.streams.ToUpperCase.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class ToUpperCaseSpec {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(transform(collection)).hasSameElementsAs(expected);
    }

}