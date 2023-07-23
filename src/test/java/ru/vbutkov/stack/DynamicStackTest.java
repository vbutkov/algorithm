package ru.vbutkov.stack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DynamicStackTest {
    @Test
    void pushAndPop() {
        DynamicStack stack = new DynamicStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertArrayEquals(stack.getStack(), new int[]{1, 2, 3, 4, 5});

        stack.push(6);
        assertArrayEquals(stack.getStack(), new int[]{1, 2, 3, 4, 5, 6, 0, 0, 0, 0});

        stack.pop();
        assertEquals(stack.size(), 5);
        assertArrayEquals(stack.getStack(), new int[]{1, 2, 3, 4, 5, 0, 0, 0, 0, 0});
        stack.pop();
        assertEquals(stack.size(), 4);
        stack.pop();

        assertEquals(stack.size(), 3);
        stack.pop();

        assertEquals(stack.size(), 2);
        stack.pop();
        assertEquals(stack.size(), 1);
        assertArrayEquals(stack.getStack(), new int[]{1, 0, 0, 0, 0});

        stack.pop();
        assertEquals(stack.size(), 0);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertArrayEquals(stack.getStack(), new int[]{1, 2, 3, 4, 5});

    }
}