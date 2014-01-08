/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Facturatie;
import be.pxl.publictms.service.FacturatieService;
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
@RequestMapping("factuur")
public class FacturatieController {
    
    @Autowired
    private FacturatieService facturatieService;
    
    @RequestMapping(value = "add",method = RequestMethod.PUT)
    public @ResponseBody void add(Facturatie factuur){
        facturatieService.addFacturatie(factuur);
    }
    
    @RequestMapping(value = "update",method = RequestMethod.PUT)
    public @ResponseBody void update(Facturatie factuur){
        facturatieService.updateFactuur(factuur);
    }
    
    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public @ResponseBody Facturatie get(@PathVariable("id") int id){
        return facturatieService.getFacturatie(id);
    }
    
    @RequestMapping(value = "getfacturen/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Facturatie> getFacturen(@PathVariable("id") int id){
        return facturatieService.getFacturen(id);
    }
    
    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public @ResponseBody void delete(@PathVariable("id") int id){
        facturatieService.deleteFactuur(id);
    }
    
}
