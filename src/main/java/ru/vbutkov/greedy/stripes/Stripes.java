package ru.vbutkov.greedy.stripes;

public class Stripes implements Comparable<Stripes> {
    private int start;
    private int end;

    public Stripes(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public int compareTo(Stripes o) {
        return Integer.compare(this.end - this.start, o.end - o.start);
    }

    @Override
    public String toString() {
        return "Stripes{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
