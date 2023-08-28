package ru.vbutkov.sort;

import java.util.Arrays;

public class QuickSort {

    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int from, int to) {
        if (to > from) {
            int divideIndex = partition(arr, from, to);
            sort(arr, from, divideIndex - 1);
            sort(arr, divideIndex, to);
        }
    }

    private int partition(int[] arr, int from, int to) {
        int pivot = arr[from];
        int i = from;
        int j = to;

        while (i < j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j, arr);
                i++;
                j--;
            }
            System.out.println(Arrays.toString(arr));
        }

        return i;
    }

    private void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
