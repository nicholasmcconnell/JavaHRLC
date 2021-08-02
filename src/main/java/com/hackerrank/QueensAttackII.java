package com.hackerrank;

public class QueensAttackII {

    public static void main(String[] args){
        int n = 5;
        int k = 3;
        int rq = 4;
        int cq = 3;

        QueensAttackII queensAttackII = new QueensAttackII();

       verticalAttack(n, rq, cq);

    }

    public static int verticalAttack(int n, int rq, int cq){
        int acc = 0;
        int vertical = n -1;
        int horizonatal = n-1;
        int i;

        if ((rq > cq)) {
            i = rq;
        } else {
            i = cq;
        }

        System.out.println("i " + i);

        for(i = 3; i>n; i--){
            System.out.println("i in iff " + i);
        }

        return acc;
    }



}
//
//    int r_sub = r_q;
//    int c_sub = c_q;
//    int count = 0;
//    int r_add = r_q;
//    int c_add = c_q;
//        while(r_sub !=1 && c_sub != 1){
//                r_sub--;
//                c_sub--;
//                count ++;
//                }
//                while(r_add <n && c_add <n){
//        r_add++;
//        c_add++;
//        count++;
//        }
//        r_sub = r_q;
//        c_sub = c_q;
//        r_add = r_q;
//        c_add = c_q;
//        while(r_sub !=1 && c_add < n){
//        r_sub--;
//        c_add++;
//        count ++;
//        }
//        while(r_add <n && c_sub !=1){
//        r_add++;
//        c_sub--;
//        count++;
//        }
//        return ((n * 2) -2) + count;
