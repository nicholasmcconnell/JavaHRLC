package com.nickdemos.java.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {

    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("nick");
        people.add("henry");
        people.add("juanita");
        people.add("Faycal");
        people.add("Eric");
        people.add("Kim");

//        for (int i = 0; i<people.size(); i++){
//            System.out.println(people.get(i));
//        }

        for (String person : people) {
            System.out.println(person);
        }
        System.out.println("+--------------------+");
        people.forEach(person -> System.out.println(person));

        System.out.println("+--------------------+");
        people.forEach(System.out::println);

        System.out.println("+--------------------+");
        List<String> noN = people.stream()
                .filter(name -> name.startsWith("n"))
                .collect(Collectors.toList());
        noN.forEach(System.out::println);

        System.out.println("+--------------------+");

        List<AppUser> peopleUser = people.stream()
                .map(person -> new AppUser(person))
                .collect(Collectors.toList());

        peopleUser.forEach(System.out::println);

    }


}
