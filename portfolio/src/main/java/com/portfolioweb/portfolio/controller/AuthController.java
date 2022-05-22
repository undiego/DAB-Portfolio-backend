
package com.portfolioweb.portfolio.controller;

import com.portfolioweb.portfolio.model.User;
import com.portfolioweb.portfolio.model.dto.UserDto;
import com.portfolioweb.portfolio.service.AuthService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    AuthService service;
    
    @GetMapping("/users")
    public List<User>getUsers(){
        return service.getUsers();
    }
    
    @PostMapping("/login")
    public boolean login(@RequestBody UserDto userDto) {
        return service.isUserEnabled(userDto);
    }
    
    //Este metodo debe ser provisorio para que no quede opcion de crear usuario en cualquier momento
    @PostMapping("/register")
    public void register(@RequestBody User us) throws Exception {
        service.saveUser(us);
    }
    
    @DeleteMapping("users/borrar/{id}")
    public void deleteUser(@PathVariable Long id){
        service.deleteUser(id);
    }
    
    @GetMapping("users/find/{id}")
    public User findUser(@PathVariable Long id){
        User us = service.findUser(id);
        return us;
    }
    
    @PutMapping("users/{id}")
    public User changeUser(@PathVariable Long id,
                            @RequestParam ("name") String nuevoName,
                            @RequestParam ("password") String nuevoPassword) throws Exception{
        User us = service.findUser(id);
        
        us.setName(nuevoName);
        us.setPassword(nuevoPassword);
                
        service.saveUser(us);
        return us;
    }
}
