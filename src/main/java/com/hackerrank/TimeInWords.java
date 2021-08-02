package com.hackerrank;

public class TimeInWords {
    public static void main(String[] arg){
        int h = 5;
        int m = 47;
        System.out.println(timeInWords(h, m));
    }

    public static String timeInWords(int h, int m) {
        // Write your code here
        String nums[] = { "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three", "twenty four",
                "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine",
        };
        if (m==0){
            return nums[h] + " o' clock ";
        } else if(m==30){
           return "half past " + nums[h];
        } else if (m < 30){
            if(m == 1){
                return "one minute past " + nums[h];
            } else if (m ==15){
                return "quarter past "+nums[h];
            } else {
                return m +" minutes past " +nums[h];
            }
        }else {
            m = 60 - m;
            h += 1;

            if(m == 1){
                return "one minute to " + nums[h];
            } else if (m ==15){
                return "quarter to "+nums[h];
            } else {
                return nums[m] +" minutes to " +nums[h];
            }
        }

    }
}
