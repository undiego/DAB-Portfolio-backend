package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.ExperLab;
import java.util.List;

public interface IExperLabService {
    
    public List<ExperLab> getExperLab();
    
    public void saveExperLab(ExperLab expl);
    
    public void deleteExperLab(Long id);
    
    public ExperLab findExperLab(Long id);
    
}