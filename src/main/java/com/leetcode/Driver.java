package com.leetcode;

public class Driver {
    public static void main(String[] arg){
        LongestCommonPrefix result = new LongestCommonPrefix();
        String[] strArr = {"dog","racecar","car"};
        System.out.println(result.longestCommonPrefix(strArr));
    }
}
