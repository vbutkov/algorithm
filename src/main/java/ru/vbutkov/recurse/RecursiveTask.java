package ru.vbutkov.recurse;

import java.util.ArrayList;
import java.util.Arrays;

//Задан массив arr[] размера N и целое число K. Задача состоит в том, чтобы найти все уникальные комбинации из заданного массива такими,
// чтобы сумма элементов в каждой комбинации была равна K.
//
//        Примеры:
//
//        Ввод: arr[] = {1, 2, 3}, K = 3
//        Вывод:
//        {1, 2}
//        {3}
//        Объяснение:
//        Это комбинации, сумма которых равна 3.
//
//        Ввод: arr[] = {2, 2, 2}, K = 4
//        Вывод:
//        {2, 2}
public class RecursiveTask {

    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> result = new ArrayList<>();

        findUniqCombination(0, 0, 3, data, result);
    }

    private static void findUniqCombination(int l, int sum, int k, ArrayList<Integer> data, ArrayList<Integer> result) {
        if (sum == k) {
            System.out.println(result);
            return;
        }
        for (int i = l; i < data.size(); i++) {
            if (sum + data.get(i) > k)
                continue;
            if (i > l && data.get(i) == data.get(i - 1))
                continue;

            result.add(data.get(i));
            findUniqCombination(i + 1, sum + data.get(i), k, data, result);
            result.remove(result.size() - 1);
        }
    }
}

