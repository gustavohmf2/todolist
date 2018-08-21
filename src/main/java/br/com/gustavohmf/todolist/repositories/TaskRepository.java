package br.com.gustavohmf.todolist.repositories;


import br.com.gustavohmf.todolist.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Interface implemented by spring data jpa and provides one task table interface of database
 */

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
