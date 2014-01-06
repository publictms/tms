/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Postcode;
import be.pxl.publictms.service.PostcodeService;
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
@RequestMapping("postcode")
public class PostcodeController {
    
    @Autowired
    private PostcodeService postcodeService;
    
    @RequestMapping(value = "gemeente/{id}",method = RequestMethod.GET)
    public @ResponseBody Postcode getGemeente(@PathVariable("id") String id){
        return postcodeService.getGemeente(id);
    }
    
    @RequestMapping(value = "gemeente",method = RequestMethod.GET)
    public @ResponseBody List<Postcode> getGemeente(){
        return postcodeService.getGemeente();
    }
    
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public @ResponseBody void addGemeente(Postcode postcode){
        postcodeService.addGemeente(postcode);
    }
    
    @RequestMapping(value = "delete",method = RequestMethod.GET)
    public @ResponseBody void deleteGemeente(@PathVariable("id") String id){
        postcodeService.deleteGemeente(id);
    }
    
    @RequestMapping(value = "update",method = RequestMethod.GET)
    public @ResponseBody void updateGemeente(Postcode postcode){
        postcodeService.updateGemeente(postcode);
    }
    
    @ExceptionHandler(Exception.class)
    public @ResponseBody String handleUncaughtException(Exception ex){
        System.out.println(ex.toString());
        return ex.toString();
    }
}
