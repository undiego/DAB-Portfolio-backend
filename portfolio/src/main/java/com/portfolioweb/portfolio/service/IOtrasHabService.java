package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.OtrasHab;
import java.util.List;

public interface IOtrasHabService {
    
    public List<OtrasHab> getOtrasHab();
    
    public void saveOtrasHab(OtrasHab otrhab);
    
    public void deleteOtrasHab(Long id);
    
    public OtrasHab findOtrasHab(Long id);
    
}
