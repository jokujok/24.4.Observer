package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    public final String taskName;
    public final String color;
    public final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public String executeTask() {
        return taskName;
    }

    @Override
    public String getTaskName() {
        return color + whatToPaint;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
