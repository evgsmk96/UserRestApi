package com.example.userrestapi.Repository;

import com.example.userrestapi.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserEntity,Long>{
    UserEntity findByName(String name);


}
