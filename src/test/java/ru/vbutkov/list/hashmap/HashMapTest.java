package ru.vbutkov.list.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashMapTest {

    @Test
    void putAndGet() {
        HashMap hm = new HashMap();
        hm.put("1", "a");
        hm.put("2", "b");
        hm.put("3", "c");

        String s = hm.get("2");
        assertNotNull(s);
        assertEquals(s, "b");

    }

}