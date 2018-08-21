package br.com.gustavohmf.todolist.service;

import br.com.gustavohmf.todolist.models.Task;
import br.com.gustavohmf.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Layer that implement all funcionalities about task and offer access to persistence layer
 */

@Service
public class TaskServiceImplement implements TaskService{


    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> listAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task findTaskById(Long id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void remove(Long taskid) {
        taskRepository.deleteById(taskid);
    }
}
