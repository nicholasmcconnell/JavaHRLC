package com.nickdemos.java.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDriver {

    public static void main(String[] args) {
        AppUser chris = new AppUser("Chris", "New York", 22, Arrays.asList("Java", "SQL", "JDBC"));
        AppUser kyle = new AppUser("Kyle", "New York", 35, Arrays.asList("Java", "SQL", "JDBC"));
        AppUser ej = new AppUser("EJ", "New York", 22, Arrays.asList("Java", "SQL", "JDBC"));
        AppUser thomas = new AppUser("Thomas", "California", 32, Arrays.asList("Java", "SQL", "JDBC"));
        AppUser seunghoon = new AppUser("Seunghoon", "Ohio", 51, Arrays.asList("Java", "SQL", "JDBC"));
        AppUser ann = new AppUser("Ann", "Florida", 25, Arrays.asList("Java", "SQL", "JDBC"));
        AppUser nobody = new AppUser("", "nowhere", 17, new ArrayList<>());

        List<AppUser> users = new ArrayList<>(Arrays.asList(chris, kyle, ej, thomas, seunghoon, ann, nobody));

        long numberOfEmptyNames = users.stream()
                .map(user -> user.getName())
                .filter(name -> name.equals(""))
                .count();
        System.out.println("number of no name users " + numberOfEmptyNames);

        Stream<AppUser> userStream = users.stream();
        Stream<String> nameStream = userStream.map(user -> user.getName());
        Stream<String> noNameStream = nameStream.filter(name -> !name.isEmpty());
        System.out.println("name count " + noNameStream.count());

        Optional<AppUser> findAnn = users.stream()
                .filter(name -> name.getName().equals("Ann"))
                .findFirst();



        findAnn.ifPresent(n -> System.out.println("ann " + ann.getName()));

        //  FLAT MAP
        List<String> skills = users.stream()
                .flatMap(user -> user.getSkills().stream())
                .collect(Collectors.toList());


    }
}
