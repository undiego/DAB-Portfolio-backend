package com.portfolioweb.portfolio.controller;

import com.portfolioweb.portfolio.model.ConocInform;
import com.portfolioweb.portfolio.service.IConocInformService;
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
public class ControllerConocInform {
    
    @Autowired
    private IConocInformService ciServ;
    
    @GetMapping("conocimientosinformaticos/mostrar")
    public List<ConocInform> getConocInform(){
        return ciServ.getConocInform();
    };
    
    @PostMapping("conocimientosinformaticos/crear")
    public ConocInform createConocInform(@RequestBody ConocInform ci){
        ciServ.saveConocInform(ci);
        return ci; //"Ítem de conocimiento informático creado correctamente";
    };
    
    @DeleteMapping("conocimientosinformaticos/borrar/{id}")
    public void deleteConocInform(@PathVariable Long id){
        ciServ.deleteConocInform(id);
        //return ""; // "Ítem de conocimiento informático borrado correctamente";
    };
    
    @PutMapping("conocimientosinformaticos/editar/{id}")
    public ConocInform editConocInform(@PathVariable Long id,
                                       @RequestBody ConocInform con){
        ConocInform ci = ciServ.findConocInform(id);
        ci.setItem(con.getItem());
        
        ciServ.saveConocInform(ci);
        return ci;        
    };
}
