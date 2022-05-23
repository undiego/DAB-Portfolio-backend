
package com.portfolioweb.portfolio.controller;

//import com.portfolioweb.portfolio.service.ItemVsService;
//import com.portfolioweb.portfolio.model.Item;
//import com.portfolioweb.portfolio.model.Educacion;
import com.portfolioweb.portfolio.model.ItemVs;
import com.portfolioweb.portfolio.service.IItemVsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerItemVs {
    
    @Autowired
    private IItemVsService ivsServ;
    
    @GetMapping("varios/mostrar")
    public List<ItemVs> getItemsVs(){
        return ivsServ.getItemsVs();
    }
    
    /*@PostMapping("/crear")
    public String createItem(@RequestBody ItemVs ivs){
        ivsServ.saveItemVs(ivs);
        return "Ítem creado en forma correcta";
    };*/
    
    @PutMapping("varios/editar/{id}")
    public ItemVs editItemVs(@PathVariable Long id,
            @RequestBody ItemVs iv){
        ItemVs ivs = ivsServ.findItemVs(id);
        ivs.setText(iv.getText());
        
        ivsServ.saveItemVs(ivs);
        return ivs;
    };
}
