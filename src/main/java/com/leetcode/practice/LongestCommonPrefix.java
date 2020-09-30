package com.leetcode.practice;

// Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
//
//Example 1:
//Input: ["flower","flow","flight"]
//Output: "fl"
//
//Example 2:
//Input: ["dog","racecar","car"]
//Output: ""
//
//Note: All given inputs are in lowercase letters a-z.

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length < 1)
            return "";
        Arrays.sort(strs);
        String firstStr = strs[0];
        int fsLen = firstStr.length();
        boolean match;
        while (fsLen >= 0) {
            match = true;
            String fsSub = firstStr.substring(0,fsLen);
            for (int i = 1; i < strs.length; i++)
                if (!strs[i].startsWith(fsSub)) {
                    match = false;
                    break;
                }
            if (match)
                return fsSub;
            else
                fsLen--;
        }

        return "";
    }

    public static void main(String[] args) {
        String [] input = {"abc", "abt", "abdog"};
        System.out.println(longestCommonPrefix(input));
    }
}
