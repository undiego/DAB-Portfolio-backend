package com.portfolioweb.portfolio.controller;

import com.portfolioweb.portfolio.model.ExperLab;
import com.portfolioweb.portfolio.service.IExperLabService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExperLabController {
    
    @Autowired
    private IExperLabService elServ;
    
    @GetMapping("experiencialaboral/mostrar")
    public List<ExperLab> getExperLab(){
        return elServ.getExperLab();
    }
    
    @PostMapping("experiencialaboral/crear")
    public ExperLab createExperLab(@RequestBody ExperLab expl){
        elServ.saveExperLab(expl);
        return expl; //"Ítem de experiencia laboral creado correctamente";
    }
    
    @DeleteMapping("experiencialaboral/borrar/{id}")
    public void deleteExperLab(@PathVariable Long id){
        elServ.deleteExperLab(id);
        //return ""; //Ítem de experiencia laboral borrado correctamente";
    }
    
    @PutMapping("experiencialaboral/editar/{id}")
    public ExperLab editExperLab(@PathVariable Long id, 
                                 @RequestBody ExperLab exp){
        
        ExperLab expl = elServ.findExperLab(id);
        expl.setInstitucion(exp.getInstitucion());
        expl.setArea(exp.getArea());
        expl.setDuracion(exp.getDuracion());
        
        elServ.saveExperLab(expl);
        return expl;
    };
}
