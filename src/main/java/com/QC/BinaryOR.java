package com.QC;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class BinaryOR {
    public static void main(String[] arg) {
        String ip = "127.0.0.1";
        int B = 011;
        String cows = "321";
//        System.out.println(binaryOR(ip));
        System.out.println(cows(cows));
    }

    static String cows(String cows){

        for(int i=0; i<cows.length(); i++){
            System.out.println(cows.charAt(i));
        }
    return "lala";
    }

    static int binaryOR(String ip) {
        char[] ipArr = ip.toCharArray();
        int count = 0;
        System.out.println(Arrays.toString(ipArr));

        for (int i = 0; i < ipArr.length; i++) {
            System.out.println(Character.getNumericValue(ipArr[i]) != -1);
            if(Character.getNumericValue(ipArr[i]) != -1){

            count += Character.getNumericValue(ipArr[i]);
            }
        }
        return count;
    }
}
