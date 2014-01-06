/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.pojo.Contact;

/**
 *
 * @author 11302785
 */
public interface ContactService {
    public void addContact(Contact contact);
    public Contact getContact(int id);
    public void deleteContact(int id);
    public void updateContact(Contact contact);
}
