package com.todoolist.todoo.repository;

import com.todoolist.todoo.entity.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface List_Repository extends JpaRepository <ToDoList,Integer> {
}
