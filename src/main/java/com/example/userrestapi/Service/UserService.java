package com.example.userrestapi.Service;


import com.example.userrestapi.Entity.UserEntity;
import com.example.userrestapi.Exepction.UserAlreadyExistEx;
import com.example.userrestapi.Exepction.UserNotFound;
import com.example.userrestapi.Model.User;
import com.example.userrestapi.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserEntity  registration(UserEntity user) throws UserAlreadyExistEx {
        if (userRepo.findByName(user.getName()) != null) {
            throw new UserAlreadyExistEx("Пользователь уже существует");
        }
        return userRepo.save(user);
    }

    public User getUser(Long id) throws UserNotFound {
        UserEntity user = userRepo.findById(id).get();
        if (user == null) {
            throw new UserNotFound("Пользователь не найден");
        }
        return User.toModel(user);
    }
}


