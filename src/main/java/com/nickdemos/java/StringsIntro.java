package com.nickdemos.java;

public class StringsIntro {

    static void intro() {
        String A = "hello";
        String B = "java";

        int sum = A.length() + B.length();
        System.out.println(sum);

        if (A.compareTo(B) > 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }

    static void subString() {
        String S = "Helloworld";

        S = S.substring(3, 7);
        System.out.println(S);
    }

}


//public class Solution {
//flower thing
//    // Complete the getMinimumCost function below.
//    static int getMinimumCost(int k, int[] c) {
//        List<Integer> listC = new ArrayList<Integer>();
//        for (int i = 0; i < c.length; i++) {
//            listC.add(c[i]);
//        }

//        Collections.sort(listC);
//        Collections.reverse(listC);

//        Integer friend = 0;
//        Integer round = 1;
//        Integer total = 0;

//        for (Integer flower : listC) {
//            if (friend.equals(k)) {
//                friend = 0;
//                round++;
//            }
//            total += (flower * round);
//            friend++;
//        }
//        return total;



class Result {

        /*
         * Complete the 'twoArrays' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER k
         *  2. INTEGER_ARRAY A
         *  3. INTEGER_ARRAY B
         */

//    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
//        // Write your code here
//        //take array A and subtract each element from K, storing these results in array C. Array C is a list of
//        //the minimum elements that must be present in B in order for the constraint to hold true.
//        //for each element in C, search B for the least element that could work (search for lowest element in B >=C[i])
//
//        Collections.sort(A);
//        Collections.sort(B);
//        Collections.reverse(B);
//
//        for (int i = 0; i < A.size(); i++) {
//            int sum = A.get(i) + B.get(i);
//            if (sum < k) {
//                return "NO";
//            }
//        }
//        return "YES";
//    }
}
