package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Strobogrammatic {
//
//    try to design something in java or javascript that takes in an array of numbers and can output which are strobogrammatic
//    that means that if you rotate it 180 degrees it's still the same number based on it's shape
//        101
//       808
//        888010888

    public static void main(String[] arg) {
        String num = "8886010888";
        System.out.println(strobogrammatic(num));
    }

    static boolean strobogrammatic(String num) {
        //if number contains, 2,4,3,4,5,6,7,9 remove from array

        HashMap<Character, Character> stroboMap = new HashMap<>();

        int frontRunner = 0;
        int tailRunner = num.length() - 1;

        stroboMap.put('0', '0');
        stroboMap.put('1', '1');
        stroboMap.put('6', '9');
        stroboMap.put('8', '8');
        stroboMap.put('9', '6');

        while (frontRunner <= tailRunner){
            char f = num.charAt(frontRunner);
            char t = num.charAt(tailRunner);

            if(stroboMap.containsKey(f) && stroboMap.containsKey(t) && stroboMap.get(f) == t){
                frontRunner++;
                tailRunner--;
            }else {
                return false;
            }
        }

        return true;
    }
}
