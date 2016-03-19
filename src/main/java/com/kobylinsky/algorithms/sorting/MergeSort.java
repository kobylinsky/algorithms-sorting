package com.kobylinsky.algorithms.sorting;

/**
 * Shellsort.
 * Shellsort is a simple extension of insertion sort that gains speed by allowing exchanges of entries that are far apart,
 * to produce partially sorted arrays that can be efficiently sorted, eventually by insertion sort.
 * <p>
 * The idea is to rearrange the array to give it the property that taking every hth entry (starting anywhere) yields a sorted sequence.
 * Such an array is said to be h-sorted.
 * <p>
 * By h-sorting for some large values of h, we can move entries in the array long distances and thus make it easier to h-sort
 * for smaller values of h.
 * Using such a procedure for any increment sequence of values of h that ends in 1 will produce a sorted array: that is shellsort.
 *
 * @author bogdankobylinsky
 */
public class MergeSort implements Sort {

    @Override
    public <T extends Comparable<T>> void sort(final T[] array) {
        int compares = 0;
        int exchanges = 0;

        System.out.printf("Compares for %d-size array: %d %n", array.length, compares);
        System.out.printf("Exchanges for %d-size array: %d %n", array.length, exchanges);
    }
}
