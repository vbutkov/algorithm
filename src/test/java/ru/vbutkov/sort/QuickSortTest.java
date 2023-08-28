package ru.vbutkov.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sort() {
        QuickSort quickSort = new QuickSort();
        int arr[] = new int[]{9, 1, 2, 3, 6, 3, 2, 0, 8, 7};

        quickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        int expected[] = new int[]{0, 1, 2, 2, 3, 3, 6, 7, 8, 9};
        assertArrayEquals(expected, arr);
    }
}