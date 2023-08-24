package ru.vbutkov.sort;

import java.util.Arrays;

public class MergeSort {

    public int[] merge(int a[], int b[]) {
        int[] result = new int[a.length + b.length];
        int aPos = 0, bPos = 0, rPos = 0;

        while ((aPos + bPos) < result.length) {
            if (aPos == a.length) {
                for (int i = bPos; i < b.length; ++i) {
                    result[rPos++] = b[i];
                }
                break;
            }
            if (bPos == b.length) {
                for (int i = aPos; i < a.length; ++i) {
                    result[rPos++] = a[i];
                }
                break;
            }

            if (a[aPos] >= b[bPos]) {
                result[rPos++] = a[aPos++];
            } else {
                result[rPos++] = b[bPos++];
            }
        }

        return result;
    }

    public int[] merge2(int a[], int b[]) {
        int[] result = new int[a.length + b.length];
        int aPos = 0, bPos = 0, rPos = 0;

        while (aPos < a.length || bPos < b.length) {
            if (aPos == a.length) {
                result[rPos++] = b[bPos++];
                continue;
            }
            if (bPos == b.length) {
                result[rPos++] = a[aPos++];
                continue;
            }

            if (a[aPos] >= b[bPos]) {
                result[rPos++] = a[aPos++];
            } else {
                result[rPos++] = b[bPos++];
            }
        }

        return result;
    }

    public int[] sort(int[] a) {
        if (a.length <= 1) return a;

        int mid = a.length / 2;

        return merge2(
                sort(Arrays.copyOfRange(a, 0, mid)),
                sort(Arrays.copyOfRange(a, mid, a.length))
        );
    }

    public void sort2(int[] a, int l, int r, int[] buf) {
        if (r - l <= 1)
            return;

        int m = (r - l) / 2 + l;

        sort2(a, 0, m, buf);
        sort2(a, m, r, buf);

        merge3(a, l, m, r, buf);

    }

    private void merge3(int[] a, int l, int m, int r, int[] buf) {
        int p1 = l, p2 = m;
        int rp = 0;

        while ((p1 < m) || (p2 < r)) {
            if (p1 == m) {
                buf[rp++] = a[p2++];
                continue;
            }
            if (p2 == r) {
                buf[rp++] = a[p1++];
                continue;
            }

            if (a[p1] >= a[p2]) {
                buf[rp++] = a[p1++];
            } else {
                buf[rp++] = a[p2++];
            }
        }
        for (int i = l; i < r; i++) {
            a[i] = buf[i - l];
        }
    }

    public void sort2(int[] a) {
        int[] buf = new int[a.length];
        sort2(a, 0, a.length, buf);
    }

}
