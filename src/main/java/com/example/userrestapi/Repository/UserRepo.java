package com.example.userrestapi.Repository;

import com.example.userrestapi.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity,Long>{
    UserEntity findByName(String name);
}
