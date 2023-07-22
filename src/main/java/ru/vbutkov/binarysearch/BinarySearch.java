package ru.vbutkov.binarysearch;

public class BinarySearch {

    public int binarySearch(int[] data, int value) {
        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (data[middle] == value) {
                return middle;
            } else if (data[middle] > value) {
                right = middle - 1;
            } else if (data[middle] < value)
                left = middle + 1;
        }
        return -1;
    }
}
