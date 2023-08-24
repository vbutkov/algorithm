package ru.vbutkov.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sortAndMerge() {
        int[] a = new int[]{3, 2, 1};
        int[] b = new int[]{5, 4, 3};
        int[] expected = new int[]{5, 4, 3, 3, 2, 1};

        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.merge(a, b);

        assertArrayEquals(expected, result);

        result = mergeSort.merge2(a, b);
        assertArrayEquals(expected, result);

        a = new int[]{5, 4, 1, 9, 0, 3};
        expected = new int[]{9, 5, 4, 3, 1, 0};
        result = mergeSort.sort(a);
        assertArrayEquals(expected, result);

        mergeSort.sort2(a);
        System.out.println(Arrays.toString(a));
        assertArrayEquals(expected, a);

    }
}