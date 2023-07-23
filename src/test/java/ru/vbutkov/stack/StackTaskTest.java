package ru.vbutkov.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTaskTest {

    @Test
    void isGoodExprBrackets() {
        StackTask task = new StackTask();
        String expr = "((((";
        boolean result = task.isGoodExprBrackets(expr);

        assertEquals(result, false);

        task = new StackTask();
        expr = "(";
        result = task.isGoodExprBrackets(expr);

        assertEquals(result, false);


        assertThrows(IllegalArgumentException.class, () -> new StackTask().isGoodExprBrackets(""));

        task = new StackTask();
        expr = "()";
        result = task.isGoodExprBrackets(expr);
        assertEquals(result, true);

        System.out.println();
        task = new StackTask();
        expr = "(()))";
        result = task.isGoodExprBrackets(expr);
        assertEquals(result, false);

        System.out.println();
        task = new StackTask();
        expr = "(()){}{}{}{}[({})][()]{}";
        result = task.isGoodExprBrackets(expr);
        assertEquals(result, true);



    }
}