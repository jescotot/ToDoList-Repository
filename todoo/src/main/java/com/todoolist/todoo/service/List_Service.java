package com.todoolist.todoo.service;

import com.todoolist.todoo.entity.ToDoList;
import com.todoolist.todoo.repository.List_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class List_Service {
    @Autowired
    private List_Repository repo;

    public void deleteList (Integer id){ repo.deleteById(id); }

    public void addList (ToDoList tList){ repo.save(tList); }

    public void modifyList (Integer id, ToDoList tList){ repo.save(tList); }

    public ToDoList getById (Integer id){ return repo.getOne(id); }

    public List getLists() { return repo.findAll(); }

}

