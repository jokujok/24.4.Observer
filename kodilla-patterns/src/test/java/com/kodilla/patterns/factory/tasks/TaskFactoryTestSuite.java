package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.ShoppingTask);
        //Then
        assertEquals("buySomething",shoppingTask.executeTask());
    }

    @Test
    void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PaintingTask);
        //Then
        assertEquals("paintSomething",paintingTask.executeTask());
    }

    @Test
    void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DrivingTask);
        //Then
        assertEquals("driveSomewhere",drivingTask.executeTask());
    }
}
