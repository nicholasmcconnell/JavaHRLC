package com.leetcode;

public class StringToIntegerATOI {
    public int stringToInteger(String s){


        //remove whitespaces
        s = s.trim();

        if(s == null || s.length() == 0){
            return 0;
        }

        double result = 0;
//        System.out.println(s);

        //handle pos and negative sign
        boolean isNegative = false;
        int startIndex = 0; //first numerical character

        if(s.charAt(startIndex) == '+' || s.charAt(startIndex) == '-'){
            startIndex++;
        }
        if(s.charAt(0) == '-') {
            isNegative = true;
        }


        //handle normal case "123"
        for (int i = startIndex; i<s.length(); i++){
            //handle non numerical character
            if(s.charAt(i) < '0' | s.charAt(i) > '9'){
                break;
            }
            int digitValue = (s.charAt(i) - '0');
//            System.out.println(digitValue);
            result = result * 10 + digitValue;
        }

        if(isNegative){
            result = -result;
        }

        // handle out of integer range
            if(result > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            if(result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

    return (int)result;
    }

}
