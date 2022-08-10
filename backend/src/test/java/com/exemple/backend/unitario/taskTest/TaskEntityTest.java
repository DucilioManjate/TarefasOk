package com.exemple.backend.unitario.taskTest;

import com.example.backend.tasks.Status;
import com.example.backend.tasks.TasksEntity;
import com.example.backend.tasks.TasksService;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.Locale;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class TaskEntityTest {
    @Autowired
    private TasksService tasksService;
    private final Faker faker = new Faker(new Locale("pt-br"));

    @Test
    void store(){
        TasksEntity tasksEntity = new TasksEntity();
        tasksEntity.setName(faker.name().name());
        tasksEntity.setDescription(faker.random().toString());
        tasksEntity.setStatus(Status.CONCLUIDO);
        tasksEntity.setPeriod(faker.date().birthday());
        TasksEntity resultdb = tasksService.store(tasksEntity);
        Assertions.assertEquals(tasksEntity, resultdb);

    }
}
