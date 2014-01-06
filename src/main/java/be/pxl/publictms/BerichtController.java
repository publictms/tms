/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Bericht;
import be.pxl.publictms.service.BerichtService;
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
@RequestMapping("bericht")
public class BerichtController {
    
    @Autowired
    private BerichtService berichtService;
    
    @RequestMapping(value = "send",method = RequestMethod.POST)
    public @ResponseBody void send(Bericht bericht){
        berichtService.send(bericht);
    }
    
    @RequestMapping(value = "get/{id}",method = RequestMethod.GET)
    public @ResponseBody List<Bericht> getBericht(@PathVariable("id") int id){
        return berichtService.getBerichten(id);
    }
    
    @RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
    public @ResponseBody void delete(@PathVariable("id") int id){
        berichtService.deleteBericht(id);
    }
    
    @ExceptionHandler(Exception.class)
    public @ResponseBody String handleUncaughtException(Exception ex){
        System.out.println(ex.toString());
        return ex.toString();
    }
}
