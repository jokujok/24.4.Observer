package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentHomeworks implements Observable {

    private final List<Observer> observers;
    private final List<String> homeworks;

    public StudentHomeworks() {
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
    }

    public void addHomework(String homework) {
        homeworks.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public List<String> getHomeworks() {
        return homeworks;
    }
}
