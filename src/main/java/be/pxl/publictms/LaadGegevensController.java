/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.DAO.LaadGegevensDAO;
import be.pxl.publictms.pojo.Laadgegevens;
import be.pxl.publictms.service.LaadGegevensService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author 11302785
 */
@Controller
@RequestMapping("laadgegevens")
public class LaadGegevensController {
    
    @Autowired
    private LaadGegevensService laadGegevensService;
    
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public @ResponseBody Laadgegevens getLaadGegevens(@PathVariable("id") int id){
        return laadGegevensService.getLaadgegevens(id);
    }
    
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public @ResponseBody void addLaadgegevens(Laadgegevens laadgegevens){
        laadGegevensService.addLaadgegevens(laadgegevens);
    }
    
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public @ResponseBody void deleteLaadGegevens(@PathVariable("id") int id){
        laadGegevensService.deleteLaadgegeven(id);
    }
    
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public @ResponseBody void updateLaadgegevens(Laadgegevens laadgegevens){
        laadGegevensService.updateLaadgegeven(laadgegevens);
    }
    
}
