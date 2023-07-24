package ru.vbutkov.array;

import org.junit.jupiter.api.Test;

import java.util.List;

class ArrayTest {

    @Test
    void isPrime() {
        Array arr = new Array();
        List<Integer> prime = arr.getPrimes(100);
        System.out.println(prime);
    }

    @Test
    void sieveEratosthenes() {
        Array arr = new Array();
        List<Integer> prime = arr.sieveEratosthenes(100);
        System.out.println(prime);
    }
}