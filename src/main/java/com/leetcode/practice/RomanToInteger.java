package com.leetcode.practice;

// Roman numerals are represented by seven symbols:
// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// Usually written largest to smallest, left to right, but there are six cases where subtraction is used:
// I can be placed before V (5) and X (10) to make 4 and 9.
// X can be placed before L (50) and C (100) to make 40 and 90.
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer. Input is within the range 1 to 3999.

import java.util.HashMap;

public class RomanToInteger {
    static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('Z',0);
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int total = 0;

        s = s + "Z";
        for(int i = s.length(); i > 1; i--) {
            int current = map.get(s.charAt(i-1));
            int previous = map.get(s.charAt(i-2));
            total = total + (current <= previous ? previous : -previous);
        }
        return total;
    }

}
