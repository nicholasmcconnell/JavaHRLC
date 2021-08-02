package com.nickdemos.java.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashBrownsSet {

    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<Integer>();
        h.add(5);
        h.add(6);
        h.add(4);
        h.add(2);
        h.add(8);
        h.add(5);

        Object[] hash = h.toArray();
        System.out.println(hash[0]);



    }

}
