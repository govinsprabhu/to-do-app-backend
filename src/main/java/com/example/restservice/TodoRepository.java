package com.example.restservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAll();

  Todo findById(Integer id);
}