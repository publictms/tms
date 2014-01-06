/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.DAO.ContactDAO;
import be.pxl.publictms.pojo.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 11302785
 */
@Service
public class ContactServiceImpl implements ContactService{
    
    @Autowired
    private ContactDAO contactDAO;

    @Transactional
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    @Transactional
    public Contact getContact(int id) {
        return contactDAO.getContact(id);
    }

    @Override
    public void deleteContact(int id) {
        contactDAO.deleteContact(id);
    }

    @Transactional
    public void updateContact(Contact contact) {
        contactDAO.updateContact(contact);
    }
    
    
    
}
