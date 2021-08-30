package com.leetcode;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums){

        int[] copy = new int[nums.length-1];

        int i = 0;
           for(int j = i+1; j < nums.length; j++){
               if(nums[i] != nums[j]){
                   nums[++i] = nums[j];
               }
           }

        System.out.println(Arrays.toString(nums));
         return i+1;
    }
}
