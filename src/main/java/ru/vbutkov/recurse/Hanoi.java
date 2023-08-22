package ru.vbutkov.recurse;

public class Hanoi {
    private static long count = 0;

    public static void main(String[] args) {
        hanoi(3, 'A', 'C', 'B');
        System.out.println(count);
    }

    private static void hanoi(int n, char from, char to, char tmp) {
        if (n <= 1) {
            System.out.println("Move " + from + " to " + to);
            count++;
            return;

        }
        hanoi(n - 1, from, tmp, to);
        System.out.println("Move " + from + " to " + to);
        count++;
        hanoi(n - 1, tmp, to, from);
    }
}
