package com.example.userrestapi.Service;

import com.example.userrestapi.Entity.ToDoEntity;
import com.example.userrestapi.Entity.UserEntity;
import com.example.userrestapi.Repository.ToDoRepo;
import com.example.userrestapi.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepo todoRepo;
    @Autowired
    private UserRepo userRepo;

    public ToDoEntity createToDo(ToDoEntity todo,Long userId) {
        UserEntity user = userRepo.findById(userId).get();
        todo.setUser(user);
        return todoRepo.save(todo);
    }

    public ToDoEntity complete(Long id) {
        ToDoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return todoRepo.save(todo);
    }
}
