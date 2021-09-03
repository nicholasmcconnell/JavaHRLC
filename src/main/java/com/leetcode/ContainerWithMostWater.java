package com.leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height){
        int max_Area = 0;
        int aPointer = 0;
        int bPointer = height.length -1;

        while(aPointer < bPointer){
           if(height[aPointer] < height[bPointer]){
               max_Area = Math.max(max_Area, height[aPointer] * (bPointer-aPointer));
               aPointer+=1;
           } else {
               max_Area = Math.max(max_Area, height[bPointer] * (bPointer-aPointer));
               bPointer-=1;
           }
        }

        return max_Area;
    }
}
