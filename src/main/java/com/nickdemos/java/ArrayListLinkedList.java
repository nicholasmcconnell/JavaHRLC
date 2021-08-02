package com.nickdemos.java;

import java.util.*;


public class ArrayListLinkedList {

    public static void main (String[] arg){


    }

    static void ArrayList(){
        List<String> arrList = new ArrayList<String>();

        arrList.add("nick");
        arrList.add("jackson");
        arrList.add("mariana");
        arrList.add("carbon");

        Iterator it = arrList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(arrList.remove("nick"));
        System.out.println(arrList.add("tim"));
        System.out.println(Collections.max(arrList));

    }

    static void LinkedList(){
        List<String> linkedList = new LinkedListDemo<String>();

        linkedList.add("blue");
        linkedList.add("pink");
        linkedList.add("green");
        linkedList.add("devil");

        System.out.println(linkedList);
        Iterator iterator = linkedList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        System.out.println(linkedList.clear());

    }

}
