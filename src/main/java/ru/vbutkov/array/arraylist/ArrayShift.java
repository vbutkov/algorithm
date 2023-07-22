package ru.vbutkov.array.arraylist;

import java.util.Arrays;

public class ArrayShift {

    public int removeElementAtIndex(int[] data, int index) {
        if (index >= data.length) return data.length;
        if (data.length == 1 && index == 0) {
            data[0] = 0;
            return 0;
        }
        if (data.length == 2 && index == 1) {
            data[0] = data[1];
            data[1] = 0;
            return data.length - 1;
        }
        for (int i = index + 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        if (index < data.length - 1) {
            data[data.length - 1] = 0;
        }

        return data.length - 1;
    }

    public int removeElementAtIndex(int[] data, int length, int index) {
        if (index >= data.length) return length;

        if (data.length == 1 && index == 0) {
            data[0] = 0;
            return 0;
        }
        if (data.length == 2 && index == 1) {
            data[0] = data[1];
            data[1] = 0;
            return length - 1;
        }
        for (int i = index + 1; i <= length; i++) {
            data[i - 1] = data[i];
        }
        if (index < length) {
            data[length] = 0;
        }

        return length - 1;
    }

    public int removeDuplicates(int[] data) {
        int size = data.length - 1;
        for (int i = 0; i < size; i++) {
            int pos = i;
            while (pos < size) {
                if (data[i] == data[pos + 1]) {
                    size = removeElementAtIndex(data, size, i);
                    pos = i;
                } else
                    pos++;
            }
        }

        return data.length;
    }
}
