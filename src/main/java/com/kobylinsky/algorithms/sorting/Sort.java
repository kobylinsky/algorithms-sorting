package com.kobylinsky.algorithms.sorting;

/**
 * @author bogdankobylinsky
 */
public interface Sort {

    <T extends Comparable<T>> void sort(T[] array);

}
