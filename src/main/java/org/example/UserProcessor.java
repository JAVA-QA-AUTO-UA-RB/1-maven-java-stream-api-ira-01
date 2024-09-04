package org.example;

import org.example.dto.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserProcessor {

    public static List<User> filterAndSortUsers(List<User> users) {
        return users.stream()

                //age over 25 years
                //email ends with "ilovedogs.com" OR "ilovecats.com"
                //sorting by the "name" field alphabetically - Asc

                .filter(user -> user.getAge() > 25)
                .filter(user -> user.getEmail().endsWith("ilovedogs.com") || user.getEmail().endsWith("ilovecats.com"))
                .sorted((u1, u2) -> u1.getName().compareTo(u2.getName()))
                .collect(Collectors.toList());
    }
}


