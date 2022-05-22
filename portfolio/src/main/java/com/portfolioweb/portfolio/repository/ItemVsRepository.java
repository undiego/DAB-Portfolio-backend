
package com.portfolioweb.portfolio.repository;

import com.portfolioweb.portfolio.model.ItemVs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemVsRepository extends JpaRepository <ItemVs, Long>{
    
}
