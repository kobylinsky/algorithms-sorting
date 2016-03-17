package com.kobylinsky.algorithms.sorting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertArrayEquals;

/**
 * @author bogdankobylinsky
 */
@RunWith(Parameterized.class)
public class SortTest {

    private Integer[] testArray;

    @Parameterized.Parameters(name = "{0}")
    public static Collection<Object[]> arrays() {
        return asList(new Object[][] {
                { new Integer[]{} },
                { new Integer[]{0} },
                { new Integer[]{0, 1} },
                { new Integer[]{0, 0, 0, 0, 0} },
                { newRandomArray(100) },
        });
    }

    public SortTest(Integer[] testArray) {
        this.testArray = testArray;
    }

    @Test
    public void testSelectionSort() {
        // Given
        final Sort selectionSort = new SelectionSort();
        System.out.println("Initial: " + Arrays.toString(testArray));
        final Integer[] expected = getProperlySortedArray(testArray);
        System.out.println("Expected: " + Arrays.toString(expected));

        // When
        selectionSort.sort(testArray);
        System.out.println("Sorted: " + Arrays.toString(testArray));

        // Then
        assertArrayEquals(expected, testArray);
    }

    @Test
    public void testInsertionSort() {
        // Given
        final Sort selectionSort = new InsertionSort();
        System.out.println("Initial: " + Arrays.toString(testArray));
        final Integer[] expected = getProperlySortedArray(testArray);
        System.out.println("Expected: " + Arrays.toString(expected));

        // When
        selectionSort.sort(testArray);
        System.out.println("Sorted: " + Arrays.toString(testArray));

        // Then
        assertArrayEquals(expected, testArray);
    }

    @Test
    public void testShellSort() {
        // Given
        final Sort selectionSort = new ShellSort();
        System.out.println("Initial: " + Arrays.toString(testArray));
        final Integer[] expected = getProperlySortedArray(testArray);
        System.out.println("Expected: " + Arrays.toString(expected));

        // When
        selectionSort.sort(testArray);
        System.out.println("Sorted: " + Arrays.toString(testArray));

        // Then
        assertArrayEquals(expected, testArray);
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
