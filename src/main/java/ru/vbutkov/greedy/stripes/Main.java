package ru.vbutkov.greedy.stripes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Stripes[] stripes = new Stripes[]{
                new Stripes(1, 5),
                new Stripes(1, 2),
                new Stripes(3, 4),
                new Stripes(2, 3)
        };
        System.out.println("Список полосок:");
        System.out.println(Arrays.toString(stripes));

        Arrays.sort(stripes, Comparator.comparingInt(Stripes::getEnd));
        System.out.println("Отсортированный список полосок:");
        System.out.println(Arrays.toString(stripes));

        ArrayList<Stripes> maxCountStripes = getListMaxCountStripes(stripes);
        System.out.println("Ответ:");
        System.out.println(maxCountStripes);

        System.out.println(getMaxCountStripes(stripes));
    }

    private static ArrayList<Stripes> getListMaxCountStripes(Stripes[] stripes) {
        ArrayList<Stripes> maxCountStripes = new ArrayList<>();
        if (stripes == null || stripes.length == 0)
            return maxCountStripes;

        maxCountStripes.add(stripes[0]);
        int j = 0;
        for (int i = 1; i < stripes.length; i++) {
            if (maxCountStripes.get(j).getEnd() <= stripes[i].getStart()) {
                maxCountStripes.add(stripes[i]);
                j++;
            }
        }

        return maxCountStripes;
    }

    private static int getMaxCountStripes(Stripes[] stripes) {
        int count = 0;
        if (stripes == null || stripes.length == 0) {
            return count;
        }
        int stripEnd = stripes[0].getEnd();
        count++;
        for (int i = 1; i < stripes.length; i++) {
            if (stripes[i].getStart() >= stripEnd) {
                count++;
                stripEnd = stripes[i].getEnd();
            }
        }

        return count;
    }

}
