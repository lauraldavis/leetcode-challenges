package com.leetcode.practice;

// Given a 32-bit signed integer, reverse digits of an integer.
// Example: input: 123, output: 321
// Assume environment only stores integers within 32-bit signed integer range [-2**31, 2**31 - 1]
// For this problem, assume your function returns 0 when the reversed integer overflows.

    // Integer.MIN_VALUE  2**-31  or -2147483648
    // Integer.MAX_VALUE  2**31 -1 or 2147483647
    // Circular connection between these when numbers overflow
    // Integer.MAX_VALUE + 1000 = Integer.MIN_VALUE + 999
    // Negative number - convert to positive, reverse it, convert it back to negative value
    // Overflow number can happen when a number is reversed
public class ReverseInteger {

    static int reverse(int x) {

        boolean isNegative = x < 0;
        if(isNegative) {
            x = x * -1;
        }

        long newNum = 0;

        while(x > 0) {
            int lastDigitOfNum = x % 10;
            newNum = (newNum * 10) + lastDigitOfNum;
            x = x/10;
        }
        if(newNum > Integer.MAX_VALUE) {
            return 0;
        }

        if(isNegative) {
            newNum = newNum * -1;
        }

        return (int) newNum;
    }
}
