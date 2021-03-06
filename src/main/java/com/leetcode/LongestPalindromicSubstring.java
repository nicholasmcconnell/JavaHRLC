package com.leetcode;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s){
        if(s == null || s.length()==0) return "";

        int start = 0;
        int end = 0;

        for(int i = 0; i<s.length(); i++){
            int len = expandFromMiddle(s,i,i);
            System.out.println("length " + len);
//            int len2 = expandFromMiddle(s, i, i+1);
//            int len = Math.max(len1, len2);
            if(len > end-start){
                start = i -((len -1)/2);
                end = i+(len/2);
                //racecar
            }
        }

        return s.substring(start, end+1);
    }

    public int expandFromMiddle(String s, int left, int right){
        System.out.println("-------------------");
        if(s == null || left>right){
            return 0;
        }

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        System.out.println(left);
        System.out.println(right);
        return right-left-1;
    }
}
