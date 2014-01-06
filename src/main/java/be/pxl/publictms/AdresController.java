/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Adres;
import be.pxl.publictms.service.AdresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author 11302785
 */
@Controller
@RequestMapping("adres")
public class AdresController {
    
    @Autowired
    private AdresService adresService;
    
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public @ResponseBody void add(Adres adres){
        adresService.addAdres(adres);
    }
    
    @RequestMapping(value = "get/{id}",method = RequestMethod.GET)
    public @ResponseBody Adres get(@PathVariable("id") int id){
        return adresService.getAdres(id);
    }
    
    @RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
    public @ResponseBody void delete(@PathVariable("id") int id){
        adresService.deleteAdres(id);
    }
    
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public @ResponseBody void update(Adres adres){
        adresService.updateAdres(adres);
    }
    
    @ExceptionHandler(Exception.class)
    public @ResponseBody String handleUncaughtException(Exception ex){
        System.out.println(ex.toString());
        return ex.toString();
    }
}
