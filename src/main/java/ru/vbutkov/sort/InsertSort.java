package ru.vbutkov.sort;

import java.util.Arrays;

public class InsertSort {

    public void sort(int[] values) {

        for (int i = 0; i < values.length; i++) {
            int saveValue = values[i];
            int j;
            for (j = i; (j > 0 && saveValue < values[j - 1]); j--) {
                values[j] = values[j - 1];
            }
            values[j] = saveValue;
        }
    }
}
