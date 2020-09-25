package com.leetcode.practice;

// Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
// Example 1:
//    Input: 121
//    Output: true
// Example 2:
//    Input: -121
//    Output: false

public class PalindromeNumber {

    static boolean isPalindrome(int x) {
        int original = x;
        boolean isNeg = x < 0;
        int reverse = 0;
        while(x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        return (original == reverse && !isNeg);
    }
}
