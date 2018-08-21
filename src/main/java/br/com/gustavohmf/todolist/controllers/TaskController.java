package br.com.gustavohmf.todolist.controllers;

import br.com.gustavohmf.todolist.models.Task;
import br.com.gustavohmf.todolist.service.TaskService;
import br.com.gustavohmf.todolist.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * receive request mapped to /task/* and responsability delegated to services layer
 *
 * Gustavo Henrique Miguel Ferreira
 */

@RestController("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;


    @GetMapping
    public ResponseEntity<Response<List<Task>>> listAll() {


        Response<List<Task>> response = new Response<List<Task>>();

        response.setData(taskService.listAll());

        if(response == null){

            response.getErrors().add("Empty table");
        }

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Response<Task>> register(@RequestBody Task task) {

        Response<Task> response = new Response<Task>();


        response.setData(taskService.save(task));

        if(response == null) {

            response.getErrors().add("Fail while try save task");
        }

        return ResponseEntity.ok(response);
    }

    @GetMapping("/delete{taskid}")
    public void delete(@RequestParam("taskid") Long taskid) {

        System.out.println("Remove: "+taskid);
        taskService.remove(taskid);
    }


}
