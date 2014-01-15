/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Voertuig;
import be.pxl.publictms.service.VoertuigService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

/**
 *
 * @author Stijn
 */
@Controller
@RequestMapping("voertuig")
public class VoertuigController {

    @Autowired
    private VoertuigService voertuigService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<List> getVoertuigen(HttpServletRequest request, HttpServletResponse response) {
        List<Voertuig> json = voertuigService.getVoertuigen();
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<List>(json, responseHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<Voertuig> getVoertuig(@PathVariable("id") int id, HttpServletRequest request, HttpServletResponse response) {
        Voertuig json = voertuigService.getVoertuig(id);
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "origin, content-type, accept, x-requested-with");
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<Voertuig>(json, responseHeaders, HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = {"application/json"})
    public @ResponseBody
    ResponseEntity addVoertuig(Voertuig voertuig, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "origin, content-type, accept, x-requested-with");
        voertuigService.addVoertuig(voertuig);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    ResponseEntity deleteVoertuig(@PathVariable("id") int id, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Headers", "origin, content-type, accept, x-requested-with");
        voertuigService.deleteVoertuig(id);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public @ResponseBody
    void updateVoertuig(Voertuig voertuig) {
        voertuigService.updateVoertuig(voertuig);
    }

    @ExceptionHandler(Exception.class)
    public @ResponseBody
    String handleUncaughtException(Exception ex) {
        System.out.println(ex.toString());
        return ex.toString();
    }
}
