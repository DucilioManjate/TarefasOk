package com.example.backend.tasks;

import com.example.backend.members.MemberEntity;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;

@Entity
@Data
public class TasksEntity {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String description;


    private Status status;

    @CreatedDate
    private Date period;
}
