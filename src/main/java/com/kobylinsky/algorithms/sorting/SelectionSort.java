package com.kobylinsky.algorithms.sorting;

/**
 * Selection sort.
 * <p>
 * One of the simplest sorting algorithms works as follows:
 * First, find the smallest item in the array, and exchange it with the first entry.
 * Then, find the next smallest item and exchange it with the second entry.
 * Continue in this way until the entire array is sorted.
 * This method is called selection sort because it works by repeatedly selecting the smallest remaining item.
 *
 * @author bogdankobylinsky
 */
public class SelectionSort implements Sort {

    @Override
    public <T extends Comparable<T>> void sort(final T[] array) {
        int compares = 0;
        int exchanges = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (SortingUtils.less(array[j], array[minIndex])) {
                    minIndex = j;
                }
                compares++;
            }
            SortingUtils.swap(array, i, minIndex);
            exchanges++;
        }
        System.out.printf("Compares for %d-size array: %d %n", array.length, compares);
        System.out.printf("Exchanges for %d-size array: %d %n", array.length, exchanges);
    }
}
