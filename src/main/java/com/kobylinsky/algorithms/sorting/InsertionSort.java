package com.kobylinsky.algorithms.sorting;

/**
 * Insertion sort.
 * <p>
 * We need to make space for the current item by moving larger items one position to the right,
 * before inserting the current item into the vacated position.
 *
 * @author bogdankobylinsky
 */
public class InsertionSort implements Sort {

    @Override
    public <T extends Comparable<T>> void sort(final T[] array) {
        int compares = 0;
        int exchanges = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                compares++;
                if (SortingUtils.less(array[j], array[j - 1])) {
                    exchanges++;
                    SortingUtils.swap(array, j - 1, j);
                }
            }
        }
        System.out.printf("Compares for %d-size array: %d %n", array.length, compares);
        System.out.printf("Exchanges for %d-size array: %d %n", array.length, exchanges);
    }
}
