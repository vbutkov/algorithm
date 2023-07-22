package ru.vbutkov.list.linkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void addElementToFirst(int element) {
        Node newNode = new Node(element);
        newNode.next = head;
        if (head == null)
            tail = newNode;
        else
            head.prev = newNode;
        head = newNode;
        size++;
    }

    public void addElementToLast(int element) {
        Node newNode = new Node(element);
        newNode.prev = tail;
        if (tail == null)
            head = newNode;
        else
            tail.next = newNode;
        tail = newNode;
        size++;
    }

    public int getSize() {
        return size;
    }

    public void addAllElementsToLast(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            addElementToLast(arr[i]);
        }
    }

    public void addAllElementsToFirst(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            addElementToFirst(arr[i]);
        }
    }


    public void printAllElements() {
        while (tail != null && head != null) {
            System.out.println("tail value:" + tail.value);
            System.out.println("head value:" + head.value);
            tail = tail.prev;
            head = head.next;
            System.out.println();
        }
    }

    public long getAllSum() {
        long sum = 0;
        while (head != null) {
            sum += head.value;
            head = head.next;
        }

        return sum;
    }


    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }

    }


}
