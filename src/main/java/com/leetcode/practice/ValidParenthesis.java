package com.leetcode.practice;

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//
//Example 1:
//Input: s = "()"
//Output: true
//
//Example 2:
//Input: s = "()[]{}"
//Output: true
//
//Example 3:
//Input: s = "(]"
//Output: false
//
//Example 4:
//Input: s = "([)]"
//Output: false
//
//Example 5:
//Input: s = "{[]}"
//Output: true
//
//Constraints:
//    1 <= s.length <= 104
//    s consists of parentheses only '()[]{}'.

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        if (s.length() < 2)
            return false;

        Stack<Integer> stack = new Stack<Integer>();

        for (char c : s.toCharArray()) {
            System.out.println("Current char is: " + c);
            System.out.println("Current char converted to int is: " + (int) c);

            if (c == '(' || c == '{' || c == '[') {
                stack.push((int)c);
                continue;
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.size() == 0)
                    return false;
                if (stack.peek() == '(' && c != ')' || stack.peek() == '{' && c!= '}' ||
                        stack.peek() == '[' && c != ']')
                    return false;
                stack.pop();
            }
        }
        if(stack.size() == 0) return true;
        while(stack.size() > 0)
            stack.pop();
        stack = null;
        return false;
    }
}
