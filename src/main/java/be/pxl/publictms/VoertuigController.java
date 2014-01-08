/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Voertuig;
import be.pxl.publictms.service.VoertuigService;
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
 * @author Stijn
 */
@Controller
@RequestMapping("voertuig")
public class VoertuigController {
    
    @Autowired
    private VoertuigService voertuigService;
    
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public @ResponseBody List<Voertuig> getVoertuigen(){
        return voertuigService.getVoertuigen();
    }
    
    @RequestMapping(value = "get/{id}",method = RequestMethod.GET)
    public @ResponseBody Voertuig getVoertuig(@PathVariable("id") int id){
        return voertuigService.getVoertuig(id);
    }
    
    @RequestMapping(value = "add", method = RequestMethod.PUT)
    public @ResponseBody void addVoertuig(Voertuig voertuig){
        voertuigService.addVoertuig(voertuig);
    }
    
    @RequestMapping(value = "delete/{id}", method = RequestMethod.PUT)
    public @ResponseBody void deleteVoertuig(@PathVariable("id") int id){
        voertuigService.deleteVoertuig(id);
    }
    
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public @ResponseBody void updateVoertuig(Voertuig voertuig){
        voertuigService.updateVoertuig(voertuig);
    }

    @ExceptionHandler(Exception.class)
    public @ResponseBody String handleUncaughtException(Exception ex){
        System.out.println(ex.toString());
        return ex.toString();
    }
}
