package com.example.userrestapi.Model;

import com.example.userrestapi.Entity.UserEntity;

public class User {
    private Long id;
    private String name;

        public static User toModel(UserEntity entity){
            User model = new User();
            model.setId(entity.getId());
            model.setName(entity.getName());
            return model;
        }

        public User(){

        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
