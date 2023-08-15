package ru.vbutkov.sort;

import java.util.Arrays;

public class CountingSort {
    public void sort(int[] values) {
        int maxValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxValue)
                maxValue = values[i];
        }
        if (maxValue < values.length)
            maxValue = values.length;

        int[] countEachValue = new int[maxValue];
        for (int i = 0; i < values.length; i++) {
            countEachValue[values[i]] += 1;
        }

        int index = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < countEachValue[i]; j++) {
                values[index] = i;
                index++;
            }

        }
    }
}
