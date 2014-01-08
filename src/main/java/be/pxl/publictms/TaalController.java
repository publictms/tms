/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Taal;
import be.pxl.publictms.service.TaalService;
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
@RequestMapping("taal")
public class TaalController {
    
    @Autowired
    private TaalService taalService;
    
    @RequestMapping(value = "get/{id}",method = RequestMethod.GET)
    public @ResponseBody Taal getTaal(@PathVariable("id") int id){
        return taalService.getTaal(id);
    }
    
    @RequestMapping(value = "add", method = RequestMethod.PUT)
    public @ResponseBody void addTaal(Taal taal){
        taalService.addTaal(taal);
    }
    
    @RequestMapping(value = "delete/{id}", method = RequestMethod.PUT)
    public @ResponseBody void deleteTaal(@PathVariable("id") int id){
        taalService.deleteTaal(id);
    }
    
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public @ResponseBody void updateTaal(Taal taal){
        taalService.updateTaal(taal);
    }

    @ExceptionHandler(Exception.class)
    public @ResponseBody String handleUncaughtException(Exception ex){
        System.out.println(ex.toString());
        return ex.toString();
    }
}
