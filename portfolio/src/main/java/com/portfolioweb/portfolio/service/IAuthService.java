
package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.User;
import java.util.List;

public interface IAuthService {
    public List<User> getUsers();
    
    public void saveUser(User us)throws Exception;
    
    public void deleteUser(Long id);
    
    public User findUser(Long id);
}
