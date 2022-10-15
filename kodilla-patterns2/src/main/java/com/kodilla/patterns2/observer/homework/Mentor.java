package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(StudentHomeworks studentHomeworks) {
        System.out.println(username + ": You have new homework from student: " + " " +
                " (total: " + studentHomeworks.getHomeworks().size() + " homeworks to checking:)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
