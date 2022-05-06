package com.kodilla.stream.forumuser;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamMain {
    public static void main (String[]args) {
        Forum theForum = new Forum();

        Map<String,ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate() > 2000)
                .filter(forumUser -> forumUser.getAmountOfPosts() >= 0);

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() +""+ entry.getValue())
                .forEach(System.out::println);
    }
}