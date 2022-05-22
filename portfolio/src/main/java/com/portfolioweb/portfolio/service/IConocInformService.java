package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.ConocInform;
import java.util.List;

public interface IConocInformService {
    
    public List<ConocInform> getConocInform();
    
    public void saveConocInform(ConocInform ci);
    
    public void deleteConocInform(Long id);
    
    public ConocInform findConocInform(Long id);
    
}