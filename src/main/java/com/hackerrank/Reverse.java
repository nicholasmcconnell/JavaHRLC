package com.hackerrank;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] arg) {
        String DNA = "GATTACA";

        DNA.replace('A', 'T');
        System.out.println(DNA);

        String[] dnaSplit = DNA.split("");
//        System.out.println(Arrays.toString(dnaSplit));
        for (int i = 0; i < dnaSplit.length; i++) {

            switch (DNA.charAt(i)) {
                case 'A':
                    dnaSplit[i] = "T";
                    break;
                case 'T':
                    dnaSplit[i] = "A";
                    break;
                case 'C':
                    dnaSplit[i] = "G";
                    break;
                case 'G':
                    dnaSplit[i] = "C";
                    break;
                default:
                    break;
            }
//            if (DNA.charAt(i) == 'A') {
//                dnaSplit[i] = "T";
//            }
//            if (DNA.charAt(i) == 'C') {
//                dnaSplit[i] = "G";
//            }
        }
        System.out.println(Arrays.toString(dnaSplit));
       DNA = String.join("", dnaSplit);
        System.out.println(DNA);
//
    }
}
