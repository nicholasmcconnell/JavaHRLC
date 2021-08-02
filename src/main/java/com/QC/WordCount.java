package com.QC;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class WordCount {

//    Input
//    Big blue red Orange biG small Purple black white white Red red
//
//    Expected Output
//    big: 2
//    red: 3
//    white: 2
//
//    Input
//    java javascript python book book club pack backpack
//
//    Expected Output
//    book: 2
//
//    Input
//    The big dog jumped high over the lazy red fox and the man with the red hat sat high in the chair and laughed
//
//    Expected Output
//    and: 2
//    high: 2
//    red: 2
//    the: 5

    public static void main(String[] args) {
        System.out.println(wordCount("The big dog jumped high over the lazy red fox and the man with the red hat sat high in the chair and laughed"));
    }

    static int wordCount(String words) {
        TreeMap<String, Integer> wordAcc = new TreeMap<String, Integer>();
        String[] wordsArr = words.split(" ");

        for (int i = 0; i < wordsArr.length; i++) {
            String word = wordsArr[i].toLowerCase();
            if (wordAcc.get(word) != null) {

                wordAcc.put(wordsArr[i], wordAcc.get(word) + 1);
            } else {
                wordAcc.put(word, 1);
            }
        }
        wordAcc.entrySet().stream().filter(word-> word.getValue() >=2).forEach(word -> System.out.println(word));


        Iterator wordIt = wordAcc.keySet().iterator();

        while(wordIt.hasNext()){
            Object word = wordIt.next();
            if(wordAcc.get(word) < 2){
                wordIt.remove();
                continue;
            }

//            System.out.println(word + ": " + wordAcc.get(word));
        }

//        for (Map.Entry m : wordAcc.entrySet()) {
//            System.out.println(m.getKey() + ": " + m.getValue());
//        }

        return 0;
    }

}
