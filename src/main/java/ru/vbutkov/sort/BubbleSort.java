package ru.vbutkov.sort;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] elements) {
        boolean isSwap;
        for (int i = 0; i < elements.length - 1; i++) {
            isSwap = false;
            for (int j = 0; j < elements.length - 1 - i; j++) {
                if (elements[j] > elements[j + 1]) {
                    swap(elements, j, j + 1);
                    isSwap = true;
                }
            }
            if (!isSwap) break;
        }
    }

    private void swap(int[] elements, int index, int nextIndex) {
        int saveValueForIndex = elements[index];
        elements[index] = elements[nextIndex];
        elements[nextIndex] = saveValueForIndex;
    }
}
