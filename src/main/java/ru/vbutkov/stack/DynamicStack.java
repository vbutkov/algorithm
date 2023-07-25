package ru.vbutkov.stack;

import java.util.Arrays;
import java.util.Objects;

public class DynamicStack {

    private static final int LOW_CAPACITY = 5;
    private int capacity;
    private int[] stack;
    private int top;

    public DynamicStack() {
        this(LOW_CAPACITY);
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

    private void shrink() {
        int length = size();
        int newCapacity = capacity / 2;
        if (length <= newCapacity / 2) {
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

    public int[] getStack() {
        return stack;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < stack.length; i++) {
            sb.append((char) stack[i]);
            sb.append(" ");
        }
        sb.append("]");

        return sb.toString();
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
