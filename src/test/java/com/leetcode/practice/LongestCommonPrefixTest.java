package com.leetcode.practice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {
    @Test
    public void testLongestCommonPrefix() {
        String[] s1={"flower", "flow", "flight"};
        String testSet1 = LongestCommonPrefix.longestCommonPrefix(s1);
        String expect1 = "fl";
        assertEquals(expect1, testSet1);

        String[] s2={"dog", "racecar", "car"};
        String testSet2 = LongestCommonPrefix.longestCommonPrefix(s2);
        String expect2 = "";
        assertEquals(expect2, testSet2);
    }
}
