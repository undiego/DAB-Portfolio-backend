
package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.User;
import com.portfolioweb.portfolio.model.dto.UserDto;
import com.portfolioweb.portfolio.repository.AuthRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class AuthService implements IAuthService{
    
    @Autowired
    private AuthRepository usRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    public boolean isUserEnabled(UserDto usDto) {
        boolean isUserEnabled = false;
        //List<User> users = usRepository.findByNameAndIsEnabledTrue(usDto.getName());
        List<User> users = usRepository.findByEmailAndIsEnabledTrue(usDto.getEmail());
        if (!users.isEmpty()) {
            User us = users.get(0);
            if (passwordEncoder.matches(usDto.getPassword(), us.getPassword()))
                isUserEnabled = true;
        }
        return isUserEnabled;
    }

    @Override
    public List<User> getUsers() {
        List<User> listaUsers = usRepository.findAll();
        return listaUsers;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveUser(User us) throws Exception {
        //List<User> users = usRepository.findByNameAndIsEnabledTrue(us.getName());
        List<User> users = usRepository.findByEmailAndIsEnabledTrue(us.getName());
        if (!users.isEmpty())
            //throw new Exception("Nombre de usuario ya registrado");
            throw new Exception("Email ya registrado");
        else {
            us.setPassword(passwordEncoder.encode(us.getPassword()));
            us.setEnabled(true);
            usRepository.save(us);
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteUser(Long id) {
        usRepository.deleteById(id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public User findUser(Long id) {
        User us = usRepository.findById(id).orElse(null);
        return us;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
