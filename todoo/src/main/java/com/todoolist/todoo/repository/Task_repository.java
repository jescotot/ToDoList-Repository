package com.todoolist.todoo.repository;

import com.todoolist.todoo.entity.ToDoTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface Task_repository extends JpaRepository<ToDoTask,Long> {

    public List<ToDoTask> findAllByToDoListTitle(String title);
    public List<ToDoTask> findByToDoListId(Integer id);
}
