package br.com.gustavohmf.todolist.service;

import br.com.gustavohmf.todolist.models.Task;

import java.util.List;


public interface TaskService {

    public List<Task> listAll();

    public Task findTaskById(Long id);

    public Task save(Task task);

    public void remove(Long id);
}
