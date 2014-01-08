/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Gebruiker;
import be.pxl.publictms.service.GebruikerService;
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
@RequestMapping("gebruiker")
public class GebruikerController {
    @Autowired
    private GebruikerService gebruikerService;
    
    @RequestMapping(value = "detail/{id}",method = RequestMethod.GET)
    public @ResponseBody Gebruiker getUser(@PathVariable("id") int id){
        return gebruikerService.getGebruikers().get(id);
    }
    
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public @ResponseBody List<Gebruiker> getUsers(){
        return gebruikerService.getGebruikers();
    }
    
    @RequestMapping(value = "add", method = RequestMethod.PUT)
    public @ResponseBody void addUser(Gebruiker gebruiker){
        if(!gebruikerService.getGebruikers().contains(gebruiker))
        gebruikerService.addGebruiker(gebruiker);
    }
    
    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public @ResponseBody void deleteUser(@PathVariable("id") int id){
        if(gebruikerService.getGebruikers().contains(gebruikerService.getGebruikers().get(id)))
        gebruikerService.deleteGebruiker(id);
    }
    
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public @ResponseBody void updateUser(Gebruiker gebruiker){
        if(gebruikerService.getGebruikers().contains(gebruiker))
        gebruikerService.updateGebruiker(gebruiker);
    }
    
    @ExceptionHandler(Exception.class)
    public @ResponseBody String handleUncaughtException(Exception ex){
        System.out.println(ex.toString());
        return ex.toString();
    }
}
