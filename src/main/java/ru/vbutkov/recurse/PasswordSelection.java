package ru.vbutkov.recurse;

import java.util.ArrayList;

public class Enumeration {

    public static void main(String[] args) throws InterruptedException {
        simpleEnumeration();
        AdvanceEnumeration();
    }

    private static void AdvanceEnumeration() throws InterruptedException {
        char[] s = new char[4];
        char[] possible = new char[100];
        int p = 0;
        for (char c = 'а'; c <= 'я'; c++) {
            possible[p++] = c;
        }
//        for (char c = 'А'; c <= 'Я'; c++) {
//            possible[p++] = c;
//        }
//        for (char c = '0'; c <= '9'; c++) {
//            possible[p++] = c;
//        }

        int count = 0;
        int a[] = new int[4];

        ArrayList<String> list = new ArrayList<>();
        for (a[0] = 0; a[0] < p; a[0]++) {
            for (a[1] = 0; a[1] < p; a[1]++) {
                for (a[2] = 0; a[2] < p; a[2]++) {
                    for (a[3] = 0; a[3] < p; a[3]++) {
                        for (int i = 0; i < 4; i++) {
                            s[i] = possible[a[i]];
                        }
                        System.out.println(s);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static void simpleEnumeration() {
        int count = 0;
        char[] s = new char[4];
        for (s[0] = 'a'; s[0] <= 'z'; s[0]++) {
            for (s[1] = 'a'; s[1] <= 'z'; s[1]++) {
                for (s[2] = 'a'; s[2] <= 'z'; s[2]++) {
                    for (s[3] = 'a'; s[3] <= 'z'; s[3]++) {
                        System.out.println(s);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
