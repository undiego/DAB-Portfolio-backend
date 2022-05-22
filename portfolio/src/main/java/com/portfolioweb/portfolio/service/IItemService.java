package com.portfolioweb.portfolio.service;

import com.portfolioweb.portfolio.model.Item;
import java.util.List;

public interface IItemService {
    public List<Item> getItems();
    
    public void saveItem(Item it);
    
    public void deleteItem(Long id);
    
    public Item findItem(Long id);
}