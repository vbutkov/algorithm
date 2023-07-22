package ru.vbutkov.array;

import java.util.ArrayList;

public class Array {

    public boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    public int[] getMaxElements(int[] arr, int count) {
        int[] result = new int[count];
        int currentMax = Integer.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            currentMax = findMaxUnderBoundary(arr, currentMax);
            result[i] = currentMax;
        }

        return result;
    }

    public int findMaxUnderBoundary(int[] arr, int top) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < top) {
                maxElement = Integer.max(maxElement, arr[i]);
            }
        }

        return maxElement;
    }

    public int[] getTwoMaxElement(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        int prevMaxElement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (isNextMaxElement(arr[i], maxElement)) {
                prevMaxElement = maxElement;
                maxElement = Integer.max(arr[i], maxElement);
            } else if (isNextMaxElement(arr[i], prevMaxElement)) {
                prevMaxElement = Integer.max(arr[i], prevMaxElement);
            }
        }
        ArrayList<Object> objects = new ArrayList<>();
        objects.remove(1);

        return new int[]{maxElement, prevMaxElement};
    }

    private boolean isNextMaxElement(int element, int maxElement) {
        return maxElement < Integer.max(element, maxElement) ? true : false;
    }


}
