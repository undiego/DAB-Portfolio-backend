package com.portfolioweb.portfolio.controller;

import com.portfolioweb.portfolio.model.Item;
import com.portfolioweb.portfolio.service.IItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IItemService interItem;
    
    @GetMapping("/items/mostrar")
    public List<Item> getItems(){
        return interItem.getItems();
    
    };
    
    @PostMapping("/items/crear")
    public Item createItem(@RequestBody Item it){
        interItem.saveItem(it);
        return it; //"Ítem creado en forma correcta";
    };
    
    @DeleteMapping("items/borrar/{id}")
    public void deleteItem(@PathVariable Long id){
        interItem.deleteItem(id);
        //return ""; //Ítem borrado";
    };
    
    @PutMapping("/items/editar/{id}")
    public Item editItem(@PathVariable Long id,
                         @RequestBody Item itm){
        Item it = interItem.findItem(id);
        
        it.setTitle(itm.getTitle());
        it.setText(itm.getText());
        it.setUrl(itm.getUrl());
        
        interItem.saveItem(it);
        return it;
    };
}
