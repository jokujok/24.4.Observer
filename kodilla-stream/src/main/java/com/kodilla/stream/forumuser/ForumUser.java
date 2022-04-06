package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final int signature;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int amountOfPosts;

    public ForumUser(int final signature, String final userName, char final sex, int final yearOfBirth, int final monthOfBirth, int final dayOfBirth, int final amountOfPosts int i, int i, String arthur_smith, String m, int i1, int i2, int i3, int i4) {
        this.signature = signature;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth)
        this.amountOfPosts = amountOfPosts;
    }

    public int getSignature() {
        return signature;
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
        return signature == forumUser.signature && sex == forumUser.sex && amountOfPosts == forumUser.amountOfPosts && userName.equals(forumUser.userName) && birthDate.equals(forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signature, userName, sex, birthDate, amountOfPosts);
    }
}
