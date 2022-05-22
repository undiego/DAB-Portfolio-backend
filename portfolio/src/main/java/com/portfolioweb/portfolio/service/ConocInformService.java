package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.ConocInform;
import com.portfolioweb.portfolio.repository.ConocInformRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConocInformService implements IConocInformService {
    
    @Autowired
    private ConocInformRepository ciRepo;

    @Override
    public List<ConocInform> getConocInform() {
        List<ConocInform> listaCI = ciRepo.findAll();
        return listaCI;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveConocInform(ConocInform ci) {
        ciRepo.save(ci);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteConocInform(Long id) {
        ciRepo.deleteById(id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ConocInform findConocInform(Long id) {
        ConocInform ci = ciRepo.findById(id).orElse(null);
        return ci;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}
