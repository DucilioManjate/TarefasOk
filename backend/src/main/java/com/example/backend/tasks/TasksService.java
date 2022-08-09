package com.example.backend.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TasksService {

    private final TasksRepository tasksRepository;

    @Autowired
    public TasksService(TasksRepository tasksRepository){
        this.tasksRepository = tasksRepository;
    }
    public TasksEntity store(TasksEntity task){
        return tasksRepository.save(task);
    }
    public List<TasksEntity> index(){
        return tasksRepository.findAll();
    }
    public Optional<TasksEntity> show(Long id){
        return tasksRepository.findById(id);
    }
    public TasksEntity update(TasksEntity tasksEntity){
        return tasksRepository.save(tasksEntity);
    }
    public void destroy(Long id) {
        Optional<TasksEntity> optionalTasksEntity = this.show(id);

        if (optionalTasksEntity.isPresent()) {
            tasksRepository.deleteById(id);
        }
    }

}
