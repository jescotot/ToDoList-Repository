package com.todoolist.todoo.controller;

import com.todoolist.todoo.entity.ToDoTask;
import com.todoolist.todoo.service.Task_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class To_do_task_controller {

    @Autowired
    Task_service tService;

    @GetMapping(value = "/alltasks")
    List<ToDoTask> getAllTasks() {
        return tService.getAllTasks();
    }

    @GetMapping(value = "list/{title}")
    public List<ToDoTask> geAllTasksByList(@PathVariable String title) {
        return tService.getsTasks(title);
    }

    @GetMapping(value = "list/{id}/task/{t_id}")
    public ToDoTask getTask(@PathVariable Long t_id) {
        return tService.getTask(t_id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/list/{id}/task")
    public void addTask(@RequestBody ToDoTask task, @PathVariable Integer id) {
        tService.savesTask(task);
    }

    @PutMapping(value = "/list/{id}/task/{t_id}")
    public void modifyTask(@RequestBody ToDoTask task, @PathVariable Integer id, @PathVariable Long t_id) {
        tService.modifyTask(t_id, task);
    }

    @PutMapping(value = "/list/{id}/task/{t_id}")
    public void deleteTask(@RequestBody ToDoTask task, @PathVariable Integer id, @PathVariable Long t_id) {
        tService.deletesTask(task);
    }
}
