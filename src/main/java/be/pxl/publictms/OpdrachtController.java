/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Opdracht;
import be.pxl.publictms.pojo.Taal;
import be.pxl.publictms.service.OpdrachtService;
import be.pxl.publictms.service.TaalService;
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
@RequestMapping("opdracht")
public class OpdrachtController {
    
    @Autowired
    private OpdrachtService opdrachtService;
    
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public @ResponseBody List<Opdracht> getOpdracht(){
        return opdrachtService.getOpdracht();
    }
    
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody void addOpdracht(Opdracht opdracht){
        opdrachtService.addOpdracht(opdracht);
    }
    
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public @ResponseBody void deleteOpdracht(@PathVariable("id") int id){
        opdrachtService.deleteOpdracht(id);
    }
    
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public @ResponseBody void updateOpdracht(Opdracht opdracht){
        opdrachtService.updateOpdracht(opdracht);
    }

    @ExceptionHandler(Exception.class)
    public @ResponseBody String handleUncaughtException(Exception ex){
        System.out.println(ex.toString());
        return ex.toString();
    }
}
