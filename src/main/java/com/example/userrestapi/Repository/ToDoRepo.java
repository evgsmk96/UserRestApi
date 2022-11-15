package com.example.userrestapi.Repository;

import com.example.userrestapi.Entity.ToDoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepo extends CrudRepository<ToDoEntity,Long>{

}
