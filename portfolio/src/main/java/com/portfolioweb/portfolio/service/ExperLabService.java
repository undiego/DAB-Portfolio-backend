package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.ExperLab;
import com.portfolioweb.portfolio.repository.ExperLabRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperLabService implements IExperLabService {
    
    @Autowired
    private ExperLabRepository elRepo;

    @Override
    public List<ExperLab> getExperLab() {
        List<ExperLab> expl = elRepo.findAll();
        return expl;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveExperLab(ExperLab expl) {
        elRepo.save(expl);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteExperLab(Long id) {
        elRepo.deleteById(id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ExperLab findExperLab(Long id) {
        ExperLab expl = elRepo.findById(id).orElse(null);
        return expl;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}
