package ru.vbutkov.stack;

public class StackTask {
    private DynamicStack stack = new DynamicStack();

    public boolean isGoodExprBrackets(String expr) {
        if (expr.isEmpty()) throw new IllegalArgumentException("The expression cannot be empty");
        int pos = 0;
        while (pos <= expr.length() - 1) {
            char ch = expr.charAt(pos);
            if (ch == ' ') {
                pos++;
                continue;
            }
            if ((ch == ')' || ch == ']' || ch == '}') && stack.isEmpty()) return false;
            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            else if (!((ch == ')' && stack.pop() == '(')
                    || (ch == ']' && stack.pop() == '[')
                    || (ch == '}' && stack.pop() == '{')
            ))
                return false;

            pos++;
        }
        if (!stack.isEmpty()) return false;

        return true;
    }
}
