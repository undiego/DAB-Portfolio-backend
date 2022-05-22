
package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.ItemVs;
import com.portfolioweb.portfolio.repository.ItemVsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemVsService implements IItemVsService {
    
    @Autowired
    private ItemVsRepository ivsRepo;
    
    @Override
    public List<ItemVs> getItemsVs() {
        List<ItemVs> itemsVs = ivsRepo.findAll();
        return itemsVs;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public ItemVs findItemVs(Long id) {
        ItemVs ivs = ivsRepo.findById(id).orElse(null);
        return ivs;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveItemVs(ItemVs ivs) {
        ivsRepo.save(ivs);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
