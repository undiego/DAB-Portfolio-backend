package com.portfolioweb.portfolio.repository;

import com.portfolioweb.portfolio.model.ExperLab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperLabRepository extends JpaRepository <ExperLab, Long>{
    
}
