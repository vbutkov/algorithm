//Дан массив целых чисел длиной n и число k.
//Нужно вывести все подмассивы длиной k входящих в исходный массив.


package ru.vbutkov.array.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Workshop1 {
    public static void main(String[] args) {
        int[] values = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer>[] subArray = getSubArray(values, 2);
//        System.out.println(Arrays.toString(subArray));


        TreeMap<Integer, Integer> schedule = new TreeMap<>();

        schedule.put(9, (schedule.getOrDefault(9, 0) + 1));
        schedule.put(12, (schedule.getOrDefault(12, 0) - 1));
        schedule.put(10, (schedule.getOrDefault(10, 0) + 1));
        schedule.put(11, (schedule.getOrDefault(11, 0) - 1));

        System.out.println(schedule);
        List s;
    }

    public static ArrayList<Integer>[] getSubArray(int[] values, int sizeSubArray) {
        ArrayList<Integer>[] result = new ArrayList[(values.length - sizeSubArray) + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = new ArrayList<>();
        }

        for (int i = 0; i < result.length; i++) {
            result[i].add(values[i]);
            for (int k = 1; k <= sizeSubArray - 1; k++) {
                if (i + k < values.length) {
                    result[i].add(values[i + k]);
                } else
                    result[i].clear();
            }
        }

        return result;
    }


}
