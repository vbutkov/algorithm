package ru.vbutkov.list.array;

import org.junit.jupiter.api.Test;
import ru.vbutkov.array.Array;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void isSorted() {
        int data[] = new int[]{1, 2, 3, 4, 5};
        Array arr = new Array();

        boolean isSorted = arr.isSorted(data);
        assertEquals(true, isSorted);

        data = new int[]{1, 2, 3, 4, 0};
        isSorted = arr.isSorted(data);
        assertEquals(false, isSorted);
    }

    @Test
    void getCountMaxElements() {
        int data[] = new int[]{1, 2, 3, 4, 5};
        Array arr = new Array();

        int[] maxElements = arr.getMaxElements(data, 3);
        assertArrayEquals(new int[]{5, 4, 3}, maxElements);
    }

    @Test
    void getTwoMaxElement() {
        int data[] = new int[]{1, 2, 3, 4, 5};
        Array arr = new Array();

        int[] twoMaxElement = arr.getTwoMaxElement(data);
        assertEquals(2, twoMaxElement.length);
        assertArrayEquals(new int[]{5, 4}, twoMaxElement);
    }
}