package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    String userName;

    public String ForumUser() {
        return "John Smith";
    }
}
