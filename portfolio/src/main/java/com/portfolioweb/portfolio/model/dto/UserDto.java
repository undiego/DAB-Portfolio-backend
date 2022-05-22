package com.portfolioweb.portfolio.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDto {
    //private String name;
    private String email;
    private String password;
    
    private UserDto() {}

    public UserDto(String name, String password) {
        //this.name = name;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        //return "UserDto{" + "nombre =" + name + ", password=" + password + '}';
        return "UserDto{" + "nombre =" + email + ", password=" + password + '}';
    }
}
