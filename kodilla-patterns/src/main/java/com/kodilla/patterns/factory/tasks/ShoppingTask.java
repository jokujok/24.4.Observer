package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {

    public final String taskName;
    public final String whatToBuy;
    public final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        return taskName;
    }

    @Override
    public String getTaskName() {
        return whatToBuy + quantity;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
