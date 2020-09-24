package com.leetcode.practice;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void testReverseInteger() {
        int n1 = 123;
        int testSet1 = ReverseInteger.reverse(n1);
        int expect1 = 321;
        assertEquals(expect1, testSet1);

        int n2 = -123;
        int testSet2 = ReverseInteger.reverse(n2);
        int expect2 = -321;
        assertEquals(expect2, testSet2);

        int n3 = 120;
        int testSet3 = ReverseInteger.reverse(n3);
        int expect3 = 21;
        assertEquals(expect3, testSet3);

    }
}
