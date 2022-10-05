package com.example.userrestapi.Controllers;

import com.example.userrestapi.Entity.UserEntity;
import com.example.userrestapi.Exepction.UserAlreadyExistEx;
import com.example.userrestapi.Exepction.UserNotFound;
import com.example.userrestapi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
   private UserService userService;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user){
        try {
            userService.registration(user);
            return ResponseEntity.ok("Пользаватель добавлен");
        } catch (UserAlreadyExistEx e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка ");
          }
    }

    @GetMapping()
    public ResponseEntity getUser(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(userService.getUser(id));
        } catch (UserNotFound e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Не ок");
        }
    }


}
