package com.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        //1.ust first array index as compare
        //2. loop over array with inner loop to check current index agains index0
        //3. when finding letter that doesn't match, resultStr becaumse substring of index0
//         String result = strs[0];
//
//         for(int i = 1; i<strs.length; i++){
//             for (int j = 0; j<strs[i].length(); j++){
//                 if(j > result.length()){
//                     break;
//                 }
//                 if(result.charAt(0) != strs[i].charAt(0)){
//                     return "";
//                 }
//                 if(result.charAt(j) != strs[i].charAt(j)){
//                     result = result.substring(0, j);
//                 }
//             }
//         }
//
//        return result;

        if(strs.length == 0) return"";

        String prefix = strs[0];

        for(int i = 1; i<strs.length; i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return "";
    }
}
