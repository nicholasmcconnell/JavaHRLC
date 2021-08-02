package com.QC;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.Arrays;
import java.util.HashMap;

public class isPalindrome {

    public static void main(String[] arg){
        System.out.println(isit());
    }

    public static boolean isit() {

//        boolean flag = true;
        String P = "dog";
        String Q = "gos";
        P.toLowerCase();
        Q.toLowerCase();

        if (P.length() != Q.length()) {
            return false;
        }

        HashMap<Character, Character> mapP = new HashMap<>();
        HashMap<Character, Character> mapQ = new HashMap<>();
        boolean flag = true;
        for (int i = 0; i < P.length(); i++) {
//            System.out.println(P.charAt(i));

        if (mapP.get(P.charAt(i)) == null && mapQ.get(Q.charAt(i)) == null) {
//                System.out.println("asdfds " + mapQ.get(Q.charAt(i)));
            mapP.put(P.charAt(i), Q.charAt(i));
            mapQ.put(Q.charAt(i), P.charAt(i));
//            System.out.println(mapP.get(P.charAt(i)));
//                System.out.println(mapQ.toString());
            continue;
        }
            System.out.println(i);
        if (mapP.get(Q.charAt(i)) != null && mapP.get(Q.charAt(i)) != Q.charAt(i)) {
            flag = false;
        } else if (mapQ.get(P.charAt(i)) != null && mapQ.get(P.charAt(i)) != Q.charAt(i)) {
            flag = false;
        }
    }
        return flag;

//
//        char[] a = P.toCharArray();
//        char[] b = Q.toCharArray();
//
//        if(Arrays.equals(a, b)){
//            return true;
//        } else {
//            return false;
//        }
    }
}
