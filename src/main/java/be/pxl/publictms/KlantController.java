/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Klant;
import be.pxl.publictms.service.KlantService;
import java.util.List;
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
@RequestMapping("klant")
public class KlantController {
    
    @Autowired
    private KlantService klantService;
    
    @RequestMapping(value = "detail/{id}",method = RequestMethod.GET)
    public @ResponseBody Klant getKlant(@PathVariable("id") int id){
        return klantService.getKlant(id);
    }
    
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public @ResponseBody List<Klant> getKlanten(){
        return klantService.getKlanten();
    }
    
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody void addKlant(Klant klant){
        if(!klantService.getKlanten().contains(klant))
        klantService.addKlant(klant);
    }
    
    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public @ResponseBody void deleteKlant(@PathVariable("id") int id){
        if(klantService.getKlanten().contains(klantService.getKlant(id)))
        klantService.deleteKlant(id);
    }
    
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public @ResponseBody void updateKlant(Klant klant){
        if(klantService.getKlanten().contains(klant))
        klantService.updateKlant(klant);
    }
    
    @ExceptionHandler(Exception.class)
    public @ResponseBody String handleUncaughtException(Exception ex){
        System.out.println(ex.toString());
        return ex.toString();
    }
}
