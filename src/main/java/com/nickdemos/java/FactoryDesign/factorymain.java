package com.nickdemos.java.FactoryDesign;

public class factorymain {

    public static void main(String[] arg){

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Closdgf");
        obj.spec();
    }
}
