package ru.vbutkov.sort;

public class ChoiceSort {
    public void sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int min = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[min]) {
                    min = j;
                }
            }
            swap(elements, i, min);
        }
    }

    private void swap(int[] elements, int large, int small) {
        int saveValueByIndex = elements[large];
        elements[large] = elements[small];
        elements[small] = saveValueByIndex;
    }
}
