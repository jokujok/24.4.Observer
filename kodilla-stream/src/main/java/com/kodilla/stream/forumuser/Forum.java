package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(001,"Arthur Smith","M",2000,12,30,10));
        theUserList.add(new ForumUser(002,"Marco Polo","M",1990,11,20, 1));
        theUserList.add(new ForumUser(003,"Jessica Jones", "F", 1995,5,10,0));
        theUserList.add(new ForumUser(004,"Camilla Rodriguez", "F", 1998,02,25, 7));
        theUserList.add(new ForumUser(005,"Adam Apple", "M", 2010,10,20,5));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
