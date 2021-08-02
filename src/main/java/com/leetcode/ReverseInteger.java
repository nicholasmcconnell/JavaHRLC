package com.leetcode;

public class ReverseInteger {
    public static void main(String[] arg) {
        int x = -123;

        System.out.println(reverseInteger(x));
    }

    public static int reverseInteger(int x) {

        //Neg Check
        boolean negCheck = false;

        if(x<0){
            negCheck = true;
            x*=-1;
        }

        //reverse field
        long reversed = 0;
        //while loop
        while(x>0){
            reversed = (reversed*10) + (x%10);
            x/=10;
        }

        //reversed max value
        if(reversed == Integer.MAX_VALUE){
            return 0;
        }
    // return neg check flag
        return negCheck ? (int) reversed * -1 : (int)reversed;
    }
}
