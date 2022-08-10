package com.example.backend.paintings;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface  PaintingRepository extends CrudRepository<PaintingEntity , Long> {

}
