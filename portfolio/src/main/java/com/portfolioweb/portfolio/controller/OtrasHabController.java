package com.portfolioweb.portfolio.controller;

import com.portfolioweb.portfolio.model.OtrasHab;
import com.portfolioweb.portfolio.service.OtrasHabService;
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
public class OtrasHabController {
    
    @Autowired
    private OtrasHabService ohServ;
    
    @GetMapping("otrashabilidades/mostrar")
    public List<OtrasHab> getOtrasHab(){
        return ohServ.getOtrasHab();
    }
    
    @PostMapping("otrashabilidades/crear")
    public OtrasHab createOtrasHab(@RequestBody OtrasHab otrHab){
        ohServ.saveOtrasHab(otrHab);
        return otrHab; //"Ítem de otras habilidades creado correctamente";
    }
    
    @DeleteMapping("otrashabilidades/borrar/{id}")
    public String deleteOtrasHab(@PathVariable Long id){
        ohServ.deleteOtrasHab(id);
        return ""; //Ítem de otras habilidades borrado correctamente";
    }
    
    @PutMapping("otrashabilidades/editar/{id}")
    public OtrasHab editOtrasHab(@PathVariable Long id,
                                  @RequestParam("text") String nuevoText,
                                  @RequestParam ("url") String nuevaUrl){
    
        OtrasHab otrhab = ohServ.findOtrasHab(id);
        otrhab.setText(nuevoText);
        otrhab.setUrl(nuevaUrl);
        
        ohServ.saveOtrasHab(otrhab);
        return otrhab;
    }
}
