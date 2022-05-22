package com.portfolioweb.portfolio.repository;

import com.portfolioweb.portfolio.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<User, Long>{
    List<User> findByEmailAndIsEnabledTrue(String email);
    //List<User> findByNameAndIsEnabledTrue(String name);
}
