package ru.vbutkov.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {

    @Test
    void sort() {
        int[] values = new int[]{5, 3, 1, -1, 0, 2};
        InsertSort insertSort = new InsertSort();
        insertSort.sort(values);

        int[] expected = new int[]{-1, 0, 1, 2, 3, 5};
        System.out.println(Arrays.toString(values));
        assertArrayEquals(expected, values);
    }
}