package com.portfolioweb.portfolio.controller;

import com.portfolioweb.portfolio.model.Educacion;
import com.portfolioweb.portfolio.service.IEducacionService;
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
public class EducacionController {
    
    @Autowired
    private IEducacionService edServ;
    
    @GetMapping("educacion/mostrar")
    public List<Educacion> getItemsEduc(){
        return edServ.getItemsEduc();
    }
    
    @PostMapping("educacion/crear")
    public Educacion createItemEduc(@RequestBody Educacion educ){
        edServ.saveItemEduc(educ);
        return educ;//"Ítem de educación creado correctamente";
    }
    
    @DeleteMapping("educacion/borrar/{id}")
    public String deleteItemEduc(@PathVariable Long id){
        edServ.deleteItemEduc(id);
        return "";//"Item de educación borrado correctamente";
    }
    
    @PutMapping("educacion/editar/{id}")
    public Educacion editItemEduc(@PathVariable Long id,
                                  @RequestParam("titulo") String nuevoTit,
                                  @RequestParam("institucion") String nuevaInst,
                                  @RequestParam("completo") boolean nuevoBool){
        
        Educacion educ = edServ.findItemEduc(id);
        educ.setTitulo(nuevoTit);
        educ.setInstitucion(nuevaInst);
        educ.setCompleto(nuevoBool);
        //educ.isCompleto();
        edServ.saveItemEduc(educ);
        return educ;
    }
}
