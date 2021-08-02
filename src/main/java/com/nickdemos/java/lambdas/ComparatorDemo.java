package com.nickdemos.java.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<String> myStrings = Arrays.asList("one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine");

        Comparator<String> stringComparator = (String s1, String s2) -> s1.compareTo(s2);
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        myStrings.sort(reverseComparator);
        System.out.println(myStrings);

        System.out.println("+--------------------------------+");

        //-------------------------------------------------------

        List<AppUser> users = Arrays.asList(
                new AppUser("Nick", "Pennsylvania", 25),
                new AppUser("Sheckeem", "Florida", 25),
                new AppUser("Ozzy", "Texas", 39),
                new AppUser("Nick", "Florida", 25),
                new AppUser("Sean", "Colorado", 44),
                new AppUser("Wezley", "Florida", 30));


        Comparator<AppUser> userComparator = Comparator.comparing(AppUser::getAge)
                .thenComparing(AppUser::getName)
                .reversed();

       users.sort(userComparator);
        users.forEach(user -> System.out.println(user));

        String username = "d";
        Predicate<String> isNullOrEmpty = str -> str == null || str.trim().isEmpty();

        System.out.println(isNullOrEmpty.test(username));


    }
}
