package ru.vbutkov.stack;

import java.util.Arrays;
import java.util.Objects;

public class DynamicStack {

    private final int LOW_CAPACITY = 5;
    int capacity;
    int[] stack;
    int top;

    public DynamicStack() {
        this(5);
    }

    public DynamicStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
    }

    private void resize() {
        int length = size();
        int[] newStack = new int[capacity * 2];
        for (int i = length - 1; i >= 0; i--) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        capacity = capacity * 2;
    }

    public void push(int element) {
        if (size() == capacity) {
            resize();
        }
        stack[top] = element;
        top++;
    }

    public void shrink() {
        int length = size();
        int newCapacity = capacity / 4;
        if (length <= newCapacity) {
            if (newCapacity < LOW_CAPACITY)
                capacity = LOW_CAPACITY;
            else
                capacity = newCapacity;
            int[] newStack = new int[capacity];
            for (int i = length - 1; i >= 0; i--) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("stack is empty");
        }
        top--;
        int element = stack[top];
        stack[top] = 0;
        shrink();

        return element;
    }

    public int peek() {
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicStack stack1 = (DynamicStack) o;
        return capacity == stack1.capacity && top == stack1.top && Arrays.equals(stack, stack1.stack);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(capacity, top);
        result = 31 * result + Arrays.hashCode(stack);
        return result;
    }
}
