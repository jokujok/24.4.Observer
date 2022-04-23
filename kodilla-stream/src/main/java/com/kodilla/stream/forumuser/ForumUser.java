package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final int ID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int amountOfPosts;

    public ForumUser(final int ID, final String userName, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int amountOfPosts) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.amountOfPosts = amountOfPosts;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAmountOfPosts() {
        return amountOfPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return ID == forumUser.ID && sex == forumUser.sex && amountOfPosts == forumUser.amountOfPosts && userName.equals(forumUser.userName) && birthDate.equals(forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, userName, sex, birthDate, amountOfPosts);
    }
}