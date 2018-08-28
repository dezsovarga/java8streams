package com.dezso.varga.exercise.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class MissingNumbers {

    /** * A general method to find missing values from an integer array in Java. * This method will work even if array has more than one missing element. */
    public static List<Integer> getMissingNumbers(int[] numbers, int count) {
        List<Integer> missingNumbers = new ArrayList<>();
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            missingNumbers.add(bitSet.nextClearBit(lastMissingIndex) + 1);
        }
        return missingNumbers;
    }

}
