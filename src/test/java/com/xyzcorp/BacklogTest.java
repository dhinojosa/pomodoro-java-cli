package com.xyzcorp;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

public class BacklogTest {

    //ZOMBIES
    //Zero
    //One
    //Many
    //Boundary
    //Interface
    //Exceptions
    //Simple


    @Test
    void testBacklogComesFreshEmpty() {
        Backlog backlog = new Backlog();
        List<Task> taskList = backlog.getTasks();
        assertThat(taskList).isEmpty();
    }

    //Start adding items to the backlog

    @Test
    void testAddTaskAndTaskListShouldNotBeEmpty() {
        Backlog backlog = new Backlog();
        backlog.addTask(new Task());
        List<Task> taskList = backlog.getTasks();
        assertThat(taskList).isNotEmpty();
    }

    //Worthwhile? Maybe not
    @Test
    void testAddThreeTasksAndTaskListShouldNotBeEmpty() {
        Backlog backlog = new Backlog();
        backlog.addTask(new Task());
        backlog.addTask(new Task());
        backlog.addTask(new Task());
        List<Task> taskList = backlog.getTasks();
        assertThat(taskList).isNotEmpty();
    }


    @Test
    void testAddNullToAddTaskShouldThrowAnException() {
        Backlog backlog = new Backlog();
        try {
            backlog.addTask(null);
            fail("That previous call shouldn't have succeeded");
        } catch (NullPointerException nullPointerException) {
            assertThat(nullPointerException).hasMessage("You cannot add a null task");
        }
    }

    @Test
    void testLimitOfTwoAndAttemptToAddThreeTasks() {
        Backlog backlog = new Backlog(2);
        backlog.addTask(new Task());
        backlog.addTask(new Task());
        try {
            backlog.addTask(new Task());
            fail("That previous call shouldn't have succeeded");
        } catch (IllegalArgumentException illegalArgumentException) {
            assertThat(illegalArgumentException).hasMessage("Task limit reached in backlog");
        }
    }
}
