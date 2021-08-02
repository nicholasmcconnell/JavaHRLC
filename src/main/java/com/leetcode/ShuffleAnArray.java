//package com.leetcode;
//
//import java.util.HashMap;
//import java.util.Random;
//
//public class ShuffleAnArray {
//
//
//
//
//    public static void main(String[] arg) {
//        ShuffleAnArray shuffle = new ShuffleAnArray();
//        randomNum();
//    }
//
//    static void randomNum(){
//
//
//        boolean flag = true;
//        for (int i = 0; i < N; i++) {
//            String P = "dog";
//            String Q = "god";
//
//            HashMap<Character, Character> mapP = new HashMap<Character, Character>();
//            HashMap<Character, Character> mapQ = new HashMap<Character, Character>();
//
//            if(mapP.get(P.charAt(i)) == null){
//                mapP.put(P.charAt(i), Q.charAt(i));
//                mapQ.put(Q.charAt(i), P.charAt(i));
//            }
//
//            System.out.println(mapP.toString());
//
//            if(mapP.get(P.charAt(i)) != Q.charAt(i) || mapQ.get(Q.charAt(i)) != P.charAt(i)){
//                flag = false;
//            }
//
//
//        }
//
//    private int[] nums;
//    private Random rand;
//
//    public ShuffleAnArray() {
//
//    }
//
//    public ShuffleAnArray(int[] nums, Random rand) {
//        this.nums = nums;
//        this.rand = new Random();
//    }
//
//    /**
//     * Resets the array to its original configuration and return it.
//     */
//    public int[] reset() {
//        return nums;
//    }
//
//    private void swap(int[] nums, int i, int j){
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }
//
//    /**
//     * Returns a random shuffling of the array.
//     */
//    public int[] shuffle() {
//
//        int[] randNums = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            randNums[i] = nums[i];
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//
//            int randIdx = i + rand.nextInt(nums.length - i);
//            swap(randNums, i, randIdx);
//        }
//        return randNums;
//    }
//}
//
