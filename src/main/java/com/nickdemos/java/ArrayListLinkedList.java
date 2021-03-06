package com.nickdemos.java;

import java.util.*;


public class ArrayListLinkedList {
    List<Integer> linkedList1 = new LinkedList();


  public static void ArrayList(){
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

    public static void LinkedList(){
        List<String> linkedList = new LinkedList<String>();

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

    public void reverseLinkedList(List<Integer> linkedList1){
        //Iterative Approach
//        ListNode prev = null;
//        ListNode curr = head;
//        ListNode next = null;
//
//        while(curr != null){
//            next = curr.next; //save next
//            curr.next = prev; //reverse pointer
//            prev = curr; //advance prev
//            curr = next; // advance current
//        }
//
//        return prev; // new head

        //Recursive Approach
}

}
