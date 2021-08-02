package com.leetcode;

public class RepeatSubStringPattern {

    public static void main(String[] args){
        RepeatSubStringPattern r = new RepeatSubStringPattern();
        String s = "abcabcabc";
        System.out.println(r.checkString(s));



    }
    public boolean checkString(String s){
        String str=s+s;
        String temp = str.substring(1,str.length()-1);
        System.out.println(temp);
        if(temp.contains(s)) return true;
        return false;

    }
}
