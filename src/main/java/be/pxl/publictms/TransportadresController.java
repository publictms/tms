/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Transportadres;
import be.pxl.publictms.service.TransportadresService;
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
@RequestMapping("transport")
public class TransportadresController {
    
    @Autowired
    private TransportadresService transportadresService;
    
    @RequestMapping(value = "get/{id}",method = RequestMethod.GET)
    public @ResponseBody Transportadres getTransportadres(@PathVariable("id") int id){
        return transportadresService.getTransportadres(id);
    }
    
    @RequestMapping(value = "add", method = RequestMethod.PUT)
    public @ResponseBody void addTransportadres(Transportadres transportadres){
        transportadresService.addTransportadres(transportadres);
    }
    
    @RequestMapping(value = "delete/{id}", method = RequestMethod.PUT)
    public @ResponseBody void deleteTransportadres(@PathVariable("id") int id){
        transportadresService.deleteTransportadres(id);
    }
    
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public @ResponseBody void updateTransportadres(Transportadres transportadres){
        transportadresService.updateTransportadres(transportadres);
    }

    @ExceptionHandler(Exception.class)
    public @ResponseBody String handleUncaughtException(Exception ex){
        System.out.println(ex.toString());
        return ex.toString();
    }
}
