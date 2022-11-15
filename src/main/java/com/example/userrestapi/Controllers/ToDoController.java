package com.example.userrestapi.Controllers;

import com.example.userrestapi.Entity.ToDoEntity;
import com.example.userrestapi.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    private ToDoService todoService;

    @PostMapping
    public ResponseEntity createToDo(@RequestBody ToDoEntity todo, @RequestParam Long userId) {
        try{
            return  ResponseEntity.ok(todoService.createToDo(todo,userId));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка ");

        }
    }

    @PutMapping
    public ResponseEntity completeToDo(@RequestParam Long id){
        try{
            return  ResponseEntity.ok(todoService.complete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка ");

        }

    }
}
