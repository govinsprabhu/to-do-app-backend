package com.example.restservice;


import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class Sample {

    @GetMapping("/todo")
    public Todo greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("inside the app");
        return new Todo(123,"Backed is working!!");
    }

    @PostMapping("/create")
    public Todo createTodo(@RequestParam(value = "todo") String todo) {
        Todo todoObj = new Todo(todo);
        return new Todo(123,todo);
    }
}
