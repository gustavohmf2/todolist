package br.com.gustavohmf.todolist.controllers;

import br.com.gustavohmf.todolist.service.TaskService;
import br.com.gustavohmf.todolist.service.TaskServiceImplement;
import br.com.gustavohmf.todolist.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;


    @GetMapping
    public ResponseEntity<Response<Task>> listAll() {


        Response<Task> response = new Response<Task>();


        return ResponseEntity.ok(response);
    }

    @PostMapping
    private ResponseEntity<Response<Task>> register(@RequestBody Task task) {

        Response<Task> response = new Response<Task>();

        return ResponseEntity.ok(response);
    }
}
