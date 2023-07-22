package ru.vbutkov.array.arraylist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayShiftTest {

    @Test
    void removeElementAtIndex() {
        int data[] = new int[]{1, 2, 3, 4, 5, 6};
        ArrayShift arrayShift = new ArrayShift();

        int lengthData = arrayShift.removeElementAtIndex(data, 0);
        assertEquals(lengthData, data.length - 1);

        assertArrayEquals(data, new int[]{2, 3, 4, 5, 6, 0});
    }

    @Test
    void removeDuplicates() {
        int data[] = new int[]{0, 11, 12, 0, 0, 0, 0};
        ArrayShift arrayShift = new ArrayShift();

        arrayShift.removeDuplicates(data);

        System.out.println(Arrays.toString(data));
    }
}