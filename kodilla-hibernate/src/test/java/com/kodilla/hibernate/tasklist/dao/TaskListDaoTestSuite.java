package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: I am learning Hibernate";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("aaa" ,DESCRIPTION);
        taskListDao.save(taskList);
        String listNames = taskList.getListName();

        //When
        List<TaskList> findTaskList = taskListDao.findByListName(listNames);

        //Then
        assertEquals(1, findTaskList.size());


        //CleanUp
        taskListDao.deleteById(taskList.getId());
    }
}
