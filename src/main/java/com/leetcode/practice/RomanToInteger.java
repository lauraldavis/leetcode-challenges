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

public class RomanToInteger {
    static int romanToInt(String s) {
        int sum = 0;
        String one = "I";
        String four = "IV";
        String five = "V";
        String nine = "IX";
        String ten = "X";
        String forty = "XL";
        String fifty = "L";
        String ninety = "XC";
        String oneHundred = "C";
        String fourHundred = "CD";
        String fiveHundred = "D";
        String nineHundred = "CM";
        String oneThousand = "M";
        String blank = "";

        while (!s.isEmpty()){
            while (s.contains(four)){
                sum += 4;
                String parsed = s.replaceFirst(four,blank);
                s = parsed;
            }
            while(s.contains(nine)){
                sum += 9;
                String parsed = s.replaceFirst(nine,blank);
                s = parsed;
            }
            while(s.contains(forty)){
                sum += 40;
                String parsed = s.replaceFirst(forty,blank);
                s = parsed;
            }
            while(s.contains(ninety)){
                sum += 90;
                String parsed = s.replaceFirst(ninety,blank);
                s = parsed;
            }
            while(s.contains(fourHundred)){
                sum += 400;
                String parsed = s.replaceFirst(fourHundred,blank);
                s = parsed;
            }
            while(s.contains(nineHundred)){
                sum += 900;
                String parsed = s.replaceFirst(nineHundred,blank);
                s = parsed;
            }
            while(s.contains(one)){
                sum += 1;
                String parsed = s.replaceFirst(one,blank);
                s = parsed;
            }
            while(s.contains(five)){
                sum += 5;
                String parsed = s.replaceFirst(five,blank);
                s = parsed;
            }
            while(s.contains(ten)){
                sum += 10;
                String parsed = s.replaceFirst(ten,blank);
                s = parsed;
            }
            while(s.contains(fifty)){
                sum += 50;
                String parsed = s.replaceFirst(fifty,blank);
                s = parsed;
            }
            while(s.contains(oneHundred)){
                sum += 100;
                String parsed = s.replaceFirst(oneHundred,blank);
                s = parsed;
            }
            while(s.contains(fiveHundred)){
                sum += 500;
                String parsed = s.replaceFirst(fiveHundred,blank);
                s = parsed;
            }
            while(s.contains(oneThousand)){
                sum += 1000;
                String parsed = s.replaceFirst(oneThousand,blank);
                s = parsed;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
}
