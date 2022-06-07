package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String DrivingTask = "DrivingTask";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case ShoppingTask:
                return new ShoppingTask("buySomething","buyABook",10.0);
            case PaintingTask:
                return new PaintingTask("paintSomething","red","PaintMyCar");
            case DrivingTask:
                return new DrivingTask("driveSomewhere","toPoland","usingACar");
            default:
                return null;
        }
    }
}
