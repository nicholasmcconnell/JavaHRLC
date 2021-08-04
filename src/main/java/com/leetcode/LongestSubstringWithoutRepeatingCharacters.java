package com.leetcode;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        //abcabcbb

        //1. loop through string,
        // 2.track if char has been used,
        //3. if not, increase count
        //4. if yes, compare to result via math.max, add to tracking string
        //5.

        if (s == "") return 0;


        int result = 0;
        int count = 0;
        String substring = "";

        for (int i = 0; i < s.length(); i++) {
            if (substring.indexOf(s.charAt(i)) != -1) {
                result = Math.max(result, substring.length());
                substring = "";
            }
            substring += s.charAt(i);
        }
        return result;
    }

    public int lengthOfLongestSubstring2(String s) {

        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;

        HashSet<Character> hash_set = new HashSet();

        while(b_pointer < s.length()){
            if(!hash_set.contains(s.charAt(b_pointer))){
                hash_set.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(hash_set.size(), max);
            }else{
                hash_set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }

}
