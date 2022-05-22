package com.portfolioweb.portfolio.controller;

import com.portfolioweb.portfolio.model.Imagenes;
import com.portfolioweb.portfolio.service.ImagenesService;
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
public class ImagenesController {
    
    @Autowired
    private ImagenesService imgServ;
    
    @GetMapping("imagenes/mostrar")
    public List<Imagenes> getImagenes(){
        return imgServ.getImagenes();
    }
    
    @PostMapping("imagenes/crear")
    public String createImagenes(@RequestBody Imagenes img){
        imgServ.saveImagenes(img);
        return "Ítem de imágenes creado correctamente";
    }
    
    @DeleteMapping("imagenes/borrar/{id}")
    public String deleteImagenes(@PathVariable Long id){
        imgServ.deleteImagenes(id);
        return "Ítem de imagenes borrado correctamente";
    }
    
    @PutMapping("imagenes/editar/{id}")
    public Imagenes editImagenes(@PathVariable Long id,
                                  @RequestParam("nombre") String nuevoNombre,
                                  @RequestParam ("url") String nuevaUrl){
    
        Imagenes img = imgServ.findImagenes(id);
        img.setNombre(nuevoNombre);
        img.setUrl(nuevaUrl);
        
        imgServ.saveImagenes(img);
        return img;
    }
}
