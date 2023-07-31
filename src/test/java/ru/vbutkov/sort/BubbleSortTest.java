package ru.vbutkov.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {


    @Test
    void sort() {
        int[] values = new int[]{10, 1, 3, 2, 7, 0};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(values);

        int[] expectedValues = new int[]{0, 1, 2, 3, 7, 10};
        assertArrayEquals(expectedValues, values);
    }
}