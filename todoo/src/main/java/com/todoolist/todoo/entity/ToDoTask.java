package com.todoolist.todoo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tasks")
@EqualsAndHashCode
public class ToDoTask {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long taskId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String descreiption;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = ToDoList.class)
    private ToDoList toDoList;

}


