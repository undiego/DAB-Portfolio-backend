package com.portfolioweb.portfolio.repository;

import com.portfolioweb.portfolio.model.ConocInform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConocInformRepository extends JpaRepository <ConocInform, Long>{
    
}
