package com.leetcode;

public class FindPeakElement {

    public static void main(String[] arg){
        int[] nums = {1,2};
        System.out.println(findPeakElement(nums));
    }


    public static int findPeakElement(int[] nums){

//        //Linear Solution
//        for (int i=1; i<nums.length; i++){
//            if((i==0 || nums[i]>nums[i-1]) && (i == nums.length -1 ||nums[i]>nums[i+1])){
//                return i;
//            }
//        }
//        return 0;

        //Binary Solution
        int L = 0;
        int R = nums.length-1;

        while(L<R){
            int m = (L+R+1)/2;
            if(nums[m-1] > nums[m]){
                R = m-1;
            }else{
                L = m;
            }
        }
        //L==R
        return L;
    }
}
