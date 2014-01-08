/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Persoonsinfo;
import be.pxl.publictms.service.PersoonsinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Stijn
 */
@Controller
@RequestMapping("persoonsinfo")
public class PersoonsinfoController {
    
    @Autowired
    private PersoonsinfoService persoonsinfoService;
    
    @RequestMapping(value = "get/{id}",method = RequestMethod.GET)
    public @ResponseBody Persoonsinfo getPersoonsinfo(@PathVariable("id") int id){
        return persoonsinfoService.getPersoonsinfo(id);
    }
    
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody void addPersoonsinfo(Persoonsinfo persoonsinfo){
        persoonsinfoService.addPersoonsinfo(persoonsinfo);
    }
    
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public @ResponseBody void deletePersoonsinfo(@PathVariable("id") int id){
        persoonsinfoService.deletePersoonsinfo(id);
    }
    
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public @ResponseBody void updatePersoonsinfo(Persoonsinfo persoonsinfo){
        persoonsinfoService.updatePersoonsinfo(persoonsinfo);
    }

    @ExceptionHandler(Exception.class)
    public @ResponseBody String handleUncaughtException(Exception ex){
        System.out.println(ex.toString());
        return ex.toString();
    }
}
