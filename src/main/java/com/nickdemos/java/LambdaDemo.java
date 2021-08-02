package com.nickdemos.java;

public class LambdaDemo {

    public static void main(String[] args) {

//        A objA = new A(){
//            @Override
//            public void show() {
//                System.out.println("hi");
//            }
//        };

        A objA = i -> System.out.println("lambda " + i);

        objA.show(78);


    }
}

interface A{
    void show(int i);
}

//class xyz implements A{
//    @Override
//    public void show() {
//        System.out.println("hi");
//    }
//}
