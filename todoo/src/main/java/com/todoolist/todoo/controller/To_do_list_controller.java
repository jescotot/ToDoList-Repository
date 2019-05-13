package com.todoolist.todoo.controller;

import com.todoolist.todoo.entity.ToDoList;
import com.todoolist.todoo.service.List_Service;
import com.todoolist.todoo.service.Task_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class To_do_list_controller {

    @Autowired
    private static List_Service lService;

    @GetMapping("/list/{id}")
    public ToDoList getList(@PathVariable Integer id) {
        return lService.getById(id);
    }

    @GetMapping(value = " /todolists/{title}")
    public void getAllLists(@PathVariable("title") String title) {
        Task_service tService = new Task_service();
        tService.getsTasks(title).forEach(System.out::println);
    }

}
