package com.dezso.varga.exercise.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.dezso.varga.exercise.streams.FilterCollection.*;
import static org.assertj.core.api.Assertions.assertThat;


/*
Filter collection so that only elements with less then 4 characters are returned.
 */

public class FilterCollectionSpec {

    @Test
    public void transformShouldFilterCollection() {
        List<String> collection = Arrays.asList("My", "name", "is", "John", "Doe");
        List<String> expected = Arrays.asList("My", "is", "Doe");
        assertThat(transform(collection)).hasSameElementsAs(expected);
    }

}