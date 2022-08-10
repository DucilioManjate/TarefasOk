package com.example.backend.tasks;

import com.example.backend.members.MemberEntity;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
public class TasksEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory!!")
    @Size(min = 3, max = 30, message = "name must be between 3 to 30 characters")
    private String name;

    @NotBlank(message = "Description is mandatory!!")
    @Size(min = 3, max = 80, message = "Description must be between 3 to 80 characters")
    private String description;


    private Status status;

    @CreatedDate
    private Date period;

    @ManyToOne
    private MemberEntity memberEntity;
}
