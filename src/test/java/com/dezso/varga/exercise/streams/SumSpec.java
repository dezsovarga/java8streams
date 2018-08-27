package com.dezso.varga.exercise.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.dezso.varga.exercise.streams.Sum.calculate;
import static com.dezso.varga.exercise.streams.Sum.calculate7;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SumSpec {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(calculate7(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
        assertThat(calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);

    }
}
