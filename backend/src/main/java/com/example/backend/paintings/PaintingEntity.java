package com.example.backend.paintings;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
public class PaintingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory!!")
    @Size(min = 3, max = 30, message = "name must be between 3 to 30 characters")
    private String name;

    @NotBlank(message = "Description is mandatory!!")
    @Size(min = 3, max = 80, message = "Description must be between 3 to 80 characters")
    private String decription;

}
