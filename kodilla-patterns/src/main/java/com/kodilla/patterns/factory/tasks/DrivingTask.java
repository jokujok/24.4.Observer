package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

   public final String taskName;
   public final String where;
   public final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    @Override
    public String executeTask() {
        return taskName;
    }

    @Override
    public String getTaskName() {
        return where + using;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }

}
