package com.leetcode;

public class LongestSubstring {

    public static void main(String[] arg){
        int[] nums1 ={10,4,6,7,2,4,3,7};
        int[] nums2 ={10,3,6,7,2,4,5,3,7};

        System.out.println(longestSubstring(nums1, nums2));
    }

    public static int longestSubstring(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;

        int dp[][] = new int[n1+1][n2+1];
        int max = 0;

        for(int i=1; i< nums1.length+1; i++){
            for(int j=1; j<nums2.length;j++){
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    max = Math.max(dp[i][j], max);
                }
            }

        }

        return max;
    }
}
