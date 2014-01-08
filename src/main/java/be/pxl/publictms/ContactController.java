/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms;

import be.pxl.publictms.pojo.Contact;
import be.pxl.publictms.service.ContactService;
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
@RequestMapping("contact")
public class ContactController {
    
    @Autowired
    private ContactService contactService;
    
    @RequestMapping(value = "add",method = RequestMethod.PUT)
    public @ResponseBody void add(Contact contact){
        contactService.addContact(contact);
    }
    
    @RequestMapping(value = "update",method = RequestMethod.PUT)
    public @ResponseBody void update(Contact contact){
        contactService.updateContact(contact);
    }
    
    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public @ResponseBody Contact get(@PathVariable("id") int id){
        return contactService.getContact(id);
    }
    
    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public @ResponseBody void delete(@PathVariable("id") int id){
        contactService.deleteContact(id);
    }
}
