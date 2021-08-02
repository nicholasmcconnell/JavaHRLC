package com.QC;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintNoDuplicates {
    public static void main(String[] args){
        int[] intArr = {1, -1,-1,-5,5,5,5,373};

        printNoDuplicates(intArr);

    }

    //    Test cases
    // negatives
    // 1 integer
    //No Duplicates
    //2

    static void printNoDuplicates(int[] intArr){

        Set<Integer> uniqueValues = new HashSet<>();

        for(int i = 0; i<intArr.length; i++){
            if(uniqueValues.add(intArr[i])){
                System.out.println(intArr[i]);
            }
        }

//        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
//
//        for(int i = 0; i<intArr.length; i++){
//            if(numsMap.get(intArr[i]) == null){
//                numsMap.put(intArr[i], intArr[i]);
//            }
//        }
//
//        for (Integer num: numsMap.keySet()) {
//            System.out.println(num);
//        }

    }
}
