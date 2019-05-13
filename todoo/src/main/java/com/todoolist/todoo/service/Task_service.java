package com.todoolist.todoo.service;

import com.todoolist.todoo.entity.ToDoTask;
import com.todoolist.todoo.repository.Task_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Task_service {

    @Autowired
    private Task_repository repo;

    public void savesTask(ToDoTask task) {
        repo.save(task);
    }

    public void deletesTask(ToDoTask task) { repo.delete(task); }

    public void modifyTask(Long taskId,ToDoTask task){ repo.save(task); }

    public ToDoTask getTask(Long taskId){ return repo.getOne(taskId); }

    public List<ToDoTask> getAllTasks(){
        return repo.findAll();
    }

    public List<ToDoTask> getsTasks(String title) {
        List<ToDoTask> tasks = new ArrayList<>();
        repo.findAllByToDoListTitle(title).forEach(tasks::add);
        return tasks;
    }


}