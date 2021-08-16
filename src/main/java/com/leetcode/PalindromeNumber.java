package com.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x){
        if(x< 0) return false;
        if(x > -1 && x < 10) return true;

        boolean result = false;

        int compareX = x;
        int reverse = 0;

        while(compareX !=0){
            int lastDigit = compareX%10;
            reverse = reverse *10 + lastDigit;
            compareX/=10;
        }
        if(reverse == x) {
            result = true;
        }

        return result;
    }
}
