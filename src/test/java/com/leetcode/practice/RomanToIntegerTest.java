package com.leetcode.practice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void testRomanToInteger() {
        String s1="III";
        int testSet1 = RomanToInteger.romanToInt(s1);
        int expect1 = 3;
        assertEquals(expect1, testSet1);

        String s2="IV";
        int testSet2 = RomanToInteger.romanToInt(s2);
        int expect2 = 4;
        assertEquals(expect2, testSet2);

        String s3="IX";
        int testSet3 = RomanToInteger.romanToInt(s3);
        int expect3 = 9;
        assertEquals(expect3, testSet3);

        String s4="LVIII";
        int testSet4 = RomanToInteger.romanToInt(s4);
        int expect4 = 58;
        assertEquals(expect4, testSet4);

        String s5="MCMXCIV";
        int testSet5 = RomanToInteger.romanToInt(s5);
        int expect5 = 1994;
        assertEquals(expect5, testSet5);
    }
}
