package br.com.gustavohmf.todolist.utils;

import java.util.List;


/**
 *
 * Represents thar response to api requests
 * @param <T> target class
 *
 * Gustavo Henrique Miguel Ferreira
 */
public class Response <T> {

    private T data;
    private List<String> errors;

    public Response() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

}
