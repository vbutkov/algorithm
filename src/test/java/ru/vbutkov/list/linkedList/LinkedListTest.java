package ru.vbutkov.list.linkedList;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void addElementAndSumAllElements() {
        LinkedList linkedList = new LinkedList();
        linkedList.addElementToFirst(1);
        linkedList.addElementToFirst(2);
        linkedList.addElementToFirst(12);

        assertEquals(3, linkedList.getSize());
        assertEquals(15, linkedList.getAllSum());
    }

    @Test
    void addElementAndSumEmptyLinkedList() {
        LinkedList linkedList = new LinkedList();
        long sum = linkedList.getAllSum();

        assertEquals(0, sum);
    }

    @Test
    void printAllElements() {
        LinkedList linkedList = new LinkedList();
        linkedList.addElementToFirst(1);
        linkedList.addElementToFirst(2);
        linkedList.addElementToFirst(3);
        linkedList.addElementToFirst(0);
        linkedList.addElementToFirst(-1);

        linkedList.printAllElements();
    }
}