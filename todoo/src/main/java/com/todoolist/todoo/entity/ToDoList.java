package com.todoolist.todoo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Lists")
@EqualsAndHashCode
public class ToDoList {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer listId;

    @Column(name = "title")
    private String title;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, targetEntity = ToDoTask.class)
    @JoinColumn(name = "to_do_list_id")
    private List<ToDoTask> tasks = new ArrayList<>();


    public ToDoList(String title) {
        this.title = title;
    }
}
