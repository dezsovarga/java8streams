package com.dezso.varga;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.dezso.varga.Sum.*;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/*
Sum all elements of a collection
 */
public class SumSpec {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(calculate7(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
        assertThat(calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);

    }

}
