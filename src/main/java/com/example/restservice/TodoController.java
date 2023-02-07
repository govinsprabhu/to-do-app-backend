package com.example.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class TodoController {
	@Autowired
	TodoRepository customerRepository;

	@GetMapping("/all")
	public List<Todo> findAll() {
		return customerRepository.findAll();
	}

	@PostMapping("/create/{todo}")
	public Todo create(@PathVariable String todo) {
		System.out.println("create "+todo);
		Todo newTodo = new Todo(todo);
		customerRepository.save(newTodo);
		return newTodo;
	}
}

