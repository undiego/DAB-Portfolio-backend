package com.portfolioweb.portfolio.repository;

import com.portfolioweb.portfolio.model.OtrasHab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtrasHabRepository extends JpaRepository<OtrasHab, Long>{
    
}
