package com.leetcode.practice;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidParenthesisTest {
    @Test
    public void testValidParenthesis() {
        String s1="()";
        boolean testSet1 = ValidParenthesis.isValid(s1);
        assertTrue(testSet1);

        String s2="()[]{}";
        boolean testSet2 = ValidParenthesis.isValid(s2);
        assertTrue(testSet2);

        String s3="(]";
        boolean testSet3 = ValidParenthesis.isValid(s3);
        assertFalse(testSet3);

        String s4="([)]";
        boolean testSet4 = ValidParenthesis.isValid(s4);
        assertFalse(testSet4);

        String s5="{[]}";
        boolean testSet5 = ValidParenthesis.isValid(s5);
        assertTrue(testSet5);
    }
}
