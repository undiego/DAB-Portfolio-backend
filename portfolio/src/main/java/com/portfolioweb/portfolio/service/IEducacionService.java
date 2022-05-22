package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> getItemsEduc();
    
    public void saveItemEduc(Educacion itEduc);
    
    public void deleteItemEduc(Long id);
    
    public Educacion findItemEduc(Long id);
    
}
