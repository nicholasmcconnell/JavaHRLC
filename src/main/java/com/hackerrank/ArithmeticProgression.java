package com.hackerrank;

public class ArithmeticProgression {

    public static void main(String[] arg){
        int m = 3;
        int d = 3;
        int n = 5;

        System.out.println(arithmeticProgression(m,d,n));

        int height = 10;
        int b1 = 3;
        int b2 = 4;

        System.out.println(towerHeight(height, b1, b2));

    }

    static int arithmeticProgression(int m, int d, int  n){
        int total = 0;
        for (int i = 0; i<n; i++){
            total+=m;
            m+=d;
        }

        return total;
    }

    static int towerHeight(int height, int b1, int b2){

        int numPBlocks = height / b1;
        int numQBlocks = 0;
        height = height % b1;
        while(height != 0 && numPBlocks >= 0){
            if( height >= b2){
                numQBlocks++;
                height -= b2;
            }
            else{
                height += b1;
                numPBlocks--;
            }
        }
        return(numPBlocks != -1 ? numPBlocks + numQBlocks : 0);

//        for (int i = 0; i < N; i++){
//            sum += M+(D*i);
//        }

    }
}
