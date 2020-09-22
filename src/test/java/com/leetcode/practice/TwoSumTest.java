package com.leetcode.practice;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        int[] ar1 = {2,7,11,15};
        int n1 = 9;
        int[] testSet1 = TwoSum.twoSum(ar1, n1);
        int[] expect1 = {0,1};
        assertArrayEquals(expect1, testSet1);

        int[] ar2 = {3,2,4};
        int n2 = 6;
        int[] testSet2 = TwoSum.twoSum(ar2, n2);
        int[] expect2 = {1, 2};
        assertArrayEquals(expect2, testSet2);

        int[] ar3 = {3,3};
        int n3 = 6;
        int[] testSet3 = TwoSum.twoSum(ar3, n3);
        int[] expect3 = {0, 1};
        assertArrayEquals(expect3, testSet3);

    }
}
