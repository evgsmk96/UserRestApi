package com.example.userrestapi.Repository;

import com.example.userrestapi.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepo extends CrudRepository<UserEntity,Long>{
    UserEntity findByName(String name);


}
