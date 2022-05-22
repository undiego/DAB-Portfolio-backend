package com.portfolioweb.portfolio.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String name;
    private String email;
    private String password;
    private boolean isEnabled;
    
    public User(){
    };
    
    public User(String name, String password, boolean isEnabled) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isEnabled = isEnabled;
    };
    
    @Override
    public String toString() {
        //return "Usuario{" + "id=" + id + ", nombre=" + name + ", password=" + password + ", isEnabled=" + isEnabled + '}';
        return "Usuario{" + "id=" + id + ", nombre=" + name + ", email=" + email + ", password=" + password + ", isEnabled=" + isEnabled + '}';
    }
}
