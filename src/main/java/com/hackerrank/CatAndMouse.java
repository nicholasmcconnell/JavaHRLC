package com.hackerrank;

public class CatAndMouse {
    public static void main(String[] arg){
        int x = 2;
        int y = 5;
        int z = 4;

        System.out.println(catAndMouse(x, y, z));
    }

    static String catAndMouse(int x, int y, int z){
        if(Math.abs(z-x) > Math.abs(z-y)){
            return "Cat B";
        } else if (Math.abs(z-x) == Math.abs(z-y)){
            return "Mouse C";
        }else {
            return "Cat A";
        }
    }
}
