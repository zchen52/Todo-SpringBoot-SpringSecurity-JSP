package com.demo.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.demo.entity.Todo;

public interface TodoService {
	List < Todo > getTodosByUser(String user);

    Optional < Todo > getTodoById(long id);

    void updateTodo(Todo todo);

    void addTodo(String name, String desc, Date targetDate);

    void deleteTodo(long id);

    void saveTodo(Todo todo);
}
