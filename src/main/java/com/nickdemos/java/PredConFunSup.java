package com.nickdemos.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PredConFunSup {
    //Functional Interface
    public static void main(String[] args){

        //Predicate - boolean result
        Predicate<String> checkLength = str -> str.length() > 5;
//        System.out.println(checkLength.test("Jackson"));

        //Consumer - no result or output
        Person p = new Person();
        Consumer<Person> setName=t-> t.setName("Play Java");
        setName.accept(p);
        System.out.println(p.getName());

        //Function - input and output
        Function<Integer, Integer> getInt = t -> t*10;
        System.out.println(getInt.apply(2));

        //Supplier - No input only supply
        Supplier<Double> getRandomDouble = () -> Math.random();
        System.out.println(getRandomDouble.get());



    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
