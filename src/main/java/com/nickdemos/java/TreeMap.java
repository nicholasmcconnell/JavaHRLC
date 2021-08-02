//package com.hackerrank.java;
//
//public class TreeMap {
//
//    public static void main(String[] args) throws Exception {
//        String[] cats = new String[]{"Fluffy", "Abby", "Boris", "Ginger", "Grey", "Snowy", "Boss", "Waldo", "Tom", "Garfield"};
//
//        TreeMap<String, Cat> treeMap = addCatsToTreeMap(cats);
//        System.out.println(treeMap.subMap("Boris", true,"Snowy",true));
//    }
//
//    public static TreeMap<String, Cat> addCatsToTreeMap(String[] cats) {
//        TreeMap<String,Cat> myCats = new TreeMap<String, Cat>();
//        for (int i = 0; i < cats.length; i++) {
//            Cat cat = new Cat(cats[i]);
//            myCats.put(cat.name, cat);
//        }
//        return myCats;
//    }
//
//    public static class Cat {
//        String name;
//
//        public Cat(String name) {
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return name != null ? name.toUpperCase() : null;
//        }
//    }
//}
