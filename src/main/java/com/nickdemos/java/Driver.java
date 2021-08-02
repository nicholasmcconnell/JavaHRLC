package com.nickdemos.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

//        StringsIntro.subString();
//        ArrayListLinkedList.ArrayList();
//        ArrayListLinkedList.LinkedList();

        int[] gradees = {4, 3, 5, 6, 7, 5, 4};
        List<Integer> grades = Arrays.asList(5,4,5,6,7,56);
        System.out.println(Arrays.toString(grades.toArray()));

        for(int i = 0; i<grades.size(); i++){
            grades.set(i, grades.get(i)*2);
            System.out.println(grades.get(i));
        }

        for (int grade : grades){

        }
//        grades.add(5);
//        grades.add(10);
//        grades.add(1, 7);


    }
}
