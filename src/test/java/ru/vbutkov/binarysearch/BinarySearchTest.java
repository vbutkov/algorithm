package ru.vbutkov.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearch() {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinarySearch bs = new BinarySearch();
        int index = bs.binarySearch(data, 1);

        assertEquals(data[index], 1);

        index = bs.binarySearch(data, 8);
        assertEquals(data[index], 8);

        index = bs.binarySearch(data, 11);
        assertEquals(index, -1);

    }
}