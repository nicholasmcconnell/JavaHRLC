package com.QC;

import java.util.Arrays;

public class VowelsInAString {
//    Input aeiou
//    Expected Output 5

//    Input moon
//    Expected Output 2

    public static void main(String[] args){

        System.out.println(vowelsInString("aeiou"));

    }

    static int vowelsInString(String word){
        int acc = 0;

        String[] stringArr = word.split("");
        for(int i = 0; i<stringArr.length; i++){

            if(("aeiou").contains(stringArr[i])){
                System.out.println("in loop if");
                acc++;
            }
        }
        return acc;
    }




}
