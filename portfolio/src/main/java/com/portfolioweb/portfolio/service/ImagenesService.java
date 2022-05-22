package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.Imagenes;
import com.portfolioweb.portfolio.repository.ImagenesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagenesService implements IImagenesService{
    
    @Autowired
    private ImagenesRepository imgRepo;

    @Override
    public List<Imagenes> getImagenes() {
        List<Imagenes> listaImg = imgRepo.findAll();
        return listaImg;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveImagenes(Imagenes img) {
        imgRepo.save(img);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteImagenes(Long id) {
        imgRepo.deleteById(id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Imagenes findImagenes(Long id) {
        Imagenes img = imgRepo.findById(id).orElse(null);
        return img;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
