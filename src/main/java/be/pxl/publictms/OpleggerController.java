/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Oplegger;
import be.pxl.publictms.service.OpleggerService;
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
@RequestMapping("oplegger")
public class OpleggerController {
    
    @Autowired
    private OpleggerService opleggerService;
    
    @RequestMapping(value = "detail/{id}",method = RequestMethod.GET)
    public @ResponseBody Oplegger getOplegger(@PathVariable("id") int id){
        return opleggerService.getOplegger(id);
    }
    
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public @ResponseBody List<Oplegger> getOpleggers(){
        return opleggerService.getOpleggers();
    }
    
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody void addOplegger(Oplegger oplegger){
        if(!opleggerService.getOpleggers().contains(oplegger))
        opleggerService.addOplegger(oplegger);
    }
    
    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public @ResponseBody void deleteOplegger(@PathVariable("id") int id){
        if(opleggerService.getOpleggers().contains(opleggerService.getOplegger(id)))
        opleggerService.deleteOpleggers(id);
    }
    
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public @ResponseBody void updateOplegger(Oplegger oplegger){
        if(opleggerService.getOpleggers().contains(oplegger))
        opleggerService.updateOplegger(oplegger);
    }
    
    @ExceptionHandler(Exception.class)
    public @ResponseBody String handleUncaughtException(Exception ex){
        System.out.println(ex.toString());
        return ex.toString();
    }
    
}
