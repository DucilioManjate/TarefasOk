package com.example.backend.tasks;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin
@RequestMapping("/api/taks")
public class TasksResource {

    private final TasksService tasksService;

    @Autowired
    public TasksResource(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    @PostMapping
    public ResponseEntity<TasksEntity> store(@Valid @RequestBody TasksEntity task){
        return ResponseEntity.ok(tasksService.store(task));
    }

    @GetMapping
    public ResponseEntity<List<TasksEntity>> index(){
        return ResponseEntity.ok(tasksService.index());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<TasksEntity>> show(@PathVariable Long id) {
        return ResponseEntity.ok(tasksService.show(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<TasksEntity> update(@PathVariable Long id, @Valid @io.swagger.v3.oas.annotations.parameters.RequestBody TasksEntity tasksEntity){
        Optional<TasksEntity> optionalTasksEntity = tasksService.show(id);

        if(optionalTasksEntity.isPresent()) {
            return ResponseEntity.ok(tasksService.update(tasksEntity));
        }else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TasksEntity> destroy(@PathVariable Long id){
        tasksService.destroy(id);
        return ResponseEntity.ok(null);
    }
}
