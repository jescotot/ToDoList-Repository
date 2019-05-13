package com.todoolist.todoo;

import com.todoolist.todoo.entity.ToDoList;
import org.junit.Test;

import static org.junit.Assert.*;

public class TodooApplicationTest {

    @Test
    public void main() {
        ToDoList listx = new ToDoList("side quests");
        assertEquals("side quests",listx.toString());
    }
}