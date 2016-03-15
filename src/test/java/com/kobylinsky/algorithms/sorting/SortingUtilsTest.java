package com.kobylinsky.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bogdankobylinsky on 3/15/16.
 */
public class SortingUtilsTest {

    @Test
    public void testSwap() {
        Integer[] arr = new Integer[] { 1, 2, 3 };
        SortingUtils.swap(arr, 0, 1);
        Assert.assertArrayEquals(new Integer[] { 2, 1, 3 }, arr);
    }

}