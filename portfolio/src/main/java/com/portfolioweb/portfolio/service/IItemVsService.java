package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.ItemVs;
import java.util.List;

public interface IItemVsService {
    
    public List<ItemVs> getItemsVs();
   
    public void saveItemVs(ItemVs ivs);
    
    public ItemVs findItemVs(Long id);
    
}
