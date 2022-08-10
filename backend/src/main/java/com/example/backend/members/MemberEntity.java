package com.example.backend.members;

import com.example.backend.paintings.PaintingEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String user_id;

    @ManyToOne
    private PaintingEntity paintingEntity;


}
