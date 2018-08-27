package com.dezso.varga.exercise.coding;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.dezso.varga.exercise.coding.MissingNumbers.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertTrue;

public class MissingNumbersSpec {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 7, 8, 10};
        int expectedMissingNumber = 6;
        List<Integer> actualMissingNumbers = getMissingNumbers(numbers, 10);
        Assert.assertTrue(Arrays.asList(expectedMissingNumber).containsAll(actualMissingNumbers) );
        Assert.assertTrue(actualMissingNumbers.containsAll(Arrays.asList(expectedMissingNumber)));

    }
}
