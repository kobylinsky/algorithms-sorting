package com.kobylinsky.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

/**
 * @author bogdankobylinsky
 */
@RunWith(Parameterized.class)
public class SortTest {

    private Integer[] testArray;

    @Parameterized.Parameters(name = "{0}")
    public static Collection<Object[]> arrays() {
        return Arrays.asList(new Object[][] { { newRandomArray(100) } });
    }

    @Test
    public void testSelectionSort() {
        // Given
        final Sort selectionSort = new SelectionSort();
        final Integer[] expected = getProperlySortedArray(testArray);

        // When
        selectionSort.sort(testArray);

        Assert.assertArrayEquals(expected, testArray);
    }

    private static Integer[] newRandomArray(final int size) {
        final Random random = new Random();
        final Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    private static Integer[] getProperlySortedArray(final Integer[] array) {
        Integer[] reference = Arrays.copyOf(array, array.length);
        Arrays.sort(reference);
        return reference;
    }

}
