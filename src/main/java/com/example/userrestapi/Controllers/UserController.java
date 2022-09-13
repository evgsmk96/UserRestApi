package com.example.userrestapi.Controllers;

import com.example.userrestapi.Entity.UserEntity;
import com.example.userrestapi.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
   public UserRepo userRepo;

    @PostMapping
    public ResponseEntity addUser(@RequestBody UserEntity user){
        try {
            if(userRepo.findByName(user.getName())!=null){
                return ResponseEntity.badRequest().body("Такой пользователь уже есть");
            }
            userRepo.save(user);
            return ResponseEntity.ok("Пользаватель добавлен");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
          }
    }


    @GetMapping()
    public ResponseEntity getUsers(){

        return null;
    }

}
