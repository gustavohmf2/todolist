package br.com.gustavohmf.todolist;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot initialization, initializes all starters in app
 */

@SpringBootApplication
public class StartApplication {


    public static void main(String[] args) {

        SpringApplication.run(StartApplication.class,args);
    }
}
