package ru.vbutkov.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

    @Test
    void sort() {
        int[] values = new int[]{5, 0, 1, 1, 5, 12, 3, 8, 7, 9, 8, 7, 5, 5};
        CountingSort countingSort = new CountingSort();
        countingSort.sort(values);

        int[] expected = new int[]{0, 1, 1, 3, 5, 5, 5, 5, 7, 7, 8, 8, 9, 12};
        System.out.println(Arrays.toString(values));
        assertArrayEquals(expected, values);
    }

}