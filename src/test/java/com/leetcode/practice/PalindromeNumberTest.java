package com.leetcode.practice;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeNumberTest {

    @Test
    public void testPalindromeNumber() {
        int n1 = 121;
        boolean testSet1 = PalindromeNumber.isPalindrome(n1);
        assertTrue(testSet1);

        int n2 = -121;
        boolean testSet2 = PalindromeNumber.isPalindrome(n2);
        assertFalse(testSet2);

        int n3 = 10;
        boolean testSet3 = PalindromeNumber.isPalindrome(n3);
        assertFalse(testSet3);

    }
}
