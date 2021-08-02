package com.leetcode;

import java.util.Arrays;

public class LicenseKeyFormatting {

    public static void main(String[] args) {

        String s =  "--a-a-a-a--";
        int k = 2;
        LicenseKeyFormatting lkf = new LicenseKeyFormatting();

        lkf.licenseKeyFormatting(s, k);
    }
//
//    public String licenseKeyFormatting(String str, int k) {
//        StringBuilder sb = new StringBuilder(str.toUpperCase().replaceAll("-",""));
//        for(int p = sb.length()-k; p>0; p-=k) sb.insert(p, "-");
//        return sb.toString();
//    }

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder result = new StringBuilder();
        int n = s.length()-1;
        int l = k;
        for(int i = 0; i<s.length(); i++){
            System.out.println(s.charAt(n-i) + " " + l);
            if (l == 0){
                System.out.println("test" + (n-i));
                result.insert(0, "-");
                l = k;
            }

            if(s.charAt(n-i) == '-'){
                continue;
            }
            if(Character.isDigit(s.charAt(n-i))){
               result.insert(0, s.charAt(n-i));
            }

            if(Character.isLetter(s.charAt(n-i))){
                result.insert(0,Character.toUpperCase(s.charAt(n-i)));
            }

            --l;
        };

        if(result.charAt(0) == '-'){
            result.deleteCharAt(0);
        }
        String resToString = result.toString();
        System.out.println(resToString);
        return resToString;
    }
}
