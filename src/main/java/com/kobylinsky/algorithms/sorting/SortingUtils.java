package com.kobylinsky.algorithms.sorting;

/**
 * Created by bogdankobylinsky on 3/15/16.
 */
public class SortingUtils {

    public static <T> void swap(T[] arr, int i1, int i2) {
        T temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

}
