package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] arg){
        String romanNumeral = "MCMXCIV";

        System.out.println(intCount(romanNumeral));
    }


    static int intCount(String romanNumeral){

        Map<Character, Integer> values = new HashMap<>();

        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;

        char[] valuesArr = romanNumeral.toCharArray();

        //loop over values Arr by two add to
        for(int i = 0; i<valuesArr.length; i++){
//            if(i == valuesArr.length-1){
//                total += values.get(valuesArr[i]);
//                return total;
//            }
            if(values.get(valuesArr[i]) < values.get(valuesArr[i+1])){
                total += (values.get(valuesArr[i+1]) - values.get(valuesArr[i]));
                i++;
            } else {
                total += values.get(valuesArr[i]);
            }
        }

        return total;
    }
}
