package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.Educacion;
import com.portfolioweb.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    private EducacionRepository edRepo;

    @Override
    public List<Educacion> getItemsEduc() {
        List<Educacion> itemsEduc = edRepo.findAll();
        return itemsEduc;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveItemEduc(Educacion itEduc) {
        edRepo.save(itEduc);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteItemEduc(Long id) {
        edRepo.deleteById(id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Educacion findItemEduc(Long id) {
        Educacion educ = edRepo.findById(id).orElse(null);
        return educ;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
