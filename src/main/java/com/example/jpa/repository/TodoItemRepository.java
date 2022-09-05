package com.example.jpa.repository;

import com.example.jpa.domain.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {


}
