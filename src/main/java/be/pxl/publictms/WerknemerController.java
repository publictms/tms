/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Werknemer;
import be.pxl.publictms.service.WerknemerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author 11302785
 */

@Controller
@RequestMapping("werknemer")
public class WerknemerController {
    @Autowired
    private WerknemerService werknemerService;
    
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public @ResponseBody List<Werknemer> getWerknemers(){
        return werknemerService.getWerknemers();
    }
    
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody void addWerknemer(Werknemer werknemer){
        if(!werknemerService.getWerknemers().contains(werknemer))
        werknemerService.addWerknemer(werknemer);
    }
    
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public @ResponseBody void deleteWerknemer(int id){
        if(werknemerService.getWerknemers().contains(werknemerService.getWerknemers().get(id)))
        werknemerService.deleteWerknemer(id);
    }
    
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public @ResponseBody void updateWerknemer(Werknemer werknemer){
        if(werknemerService.getWerknemers().contains(werknemer))
        werknemerService.updateWerknemer(werknemer);
    }

    @ExceptionHandler(Exception.class)
    public @ResponseBody String handleUncaughtException(Exception ex){
        System.out.println(ex.toString());
        return ex.toString();
    }
}
