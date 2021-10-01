package com.leetcode;

public class Driver {
    public static void main(String[] arg){

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray result = new MaximumSubarray();
        System.out.println(result.maxContiuousSubArraySumLinearTime(nums));

    }
}
