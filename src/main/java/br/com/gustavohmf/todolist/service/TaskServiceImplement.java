package br.com.gustavohmf.todolist.service;

import br.com.gustavohmf.todolist.models.Task;
import br.com.gustavohmf.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskServiceImplement implements TaskService{


    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> listAll() {
        return null;
    }

    @Override
    public Task findTaskById(Long id) {
        return null;
    }

    @Override
    public Task save(Task task) {
        return null;
    }

    @Override
    public void remove(Task task) {

    }
}
