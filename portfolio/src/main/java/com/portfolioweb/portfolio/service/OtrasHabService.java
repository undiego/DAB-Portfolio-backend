package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.OtrasHab;
import com.portfolioweb.portfolio.repository.OtrasHabRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtrasHabService implements IOtrasHabService {
    
    @Autowired
    private OtrasHabRepository ohRepo;

    @Override
    public List<OtrasHab> getOtrasHab() {
        List<OtrasHab> listaOtrasHab = ohRepo.findAll();
        return listaOtrasHab;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveOtrasHab(OtrasHab otrhab) {
        ohRepo.save(otrhab);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteOtrasHab(Long id) {
        ohRepo.deleteById(id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public OtrasHab findOtrasHab(Long id) {
        OtrasHab otrhab = ohRepo.findById(id).orElse(null);
        return otrhab;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
