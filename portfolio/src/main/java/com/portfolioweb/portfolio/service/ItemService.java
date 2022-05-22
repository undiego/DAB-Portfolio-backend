package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.Item;
import com.portfolioweb.portfolio.repository.ItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService implements IItemService {
    
    @Autowired
    private ItemRepository itRepository;

    @Override
    public List<Item> getItems() {
        List<Item> listaItems = itRepository.findAll();
        return listaItems;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveItem(Item it) {
        itRepository.save(it);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteItem(Long id) {
        itRepository.deleteById(id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Item findItem(Long id) {
        Item it = itRepository.findById(id).orElse(null);
        return it;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
