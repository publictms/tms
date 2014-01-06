/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Contact;

/**
 *
 * @author 11302785
 */
public interface ContactDAO {
    public void addContact(Contact contact);
    public Contact getContact(int id);
    public void deleteContact(int id);
    public void updateContact(Contact contact);
}
