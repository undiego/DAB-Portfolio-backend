package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.Imagenes;
import java.util.List;

public interface IImagenesService {
    
    public List<Imagenes> getImagenes();
    
    public void saveImagenes(Imagenes img);
    
    public void deleteImagenes(Long id);
    
    public Imagenes findImagenes(Long id);
    
}
