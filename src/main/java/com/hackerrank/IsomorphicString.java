package com.hackerrank;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] arg) {
        String s = "babc";
        String t = "babt";

        System.out.println(isIsomorphic(s, t));

    }

    public static boolean isIsomorphic(String s, String t) {

        if (t.length() != s.length()) {
            return false;
        }

        if (t.isEmpty() || s.isEmpty()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            //loop over

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

          if(map1.containsKey(c1)){
              if(c2 != map1.get(c1)){
                  return false;
              }
          }else {
              if(map2.containsKey(c2)){
                  System.out.println("asdfs");
                  return false;
              }

              map1.put(c1,c2);
              map2.put(c2,c1);
          }
        }

        return true;
    }
}
