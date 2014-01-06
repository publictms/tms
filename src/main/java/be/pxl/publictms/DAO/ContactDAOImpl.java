/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.hibernate.HibernateUtil;
import be.pxl.publictms.pojo.Contact;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 11302785
 */
@Repository
public class ContactDAOImpl implements ContactDAO{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }

    @Override
    public Contact getContact(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Contact where ContactId = :id");
        query.setParameter("id", id);
        return (Contact)query.list().get(0);
    }

    @Override
    public void deleteContact(int id) {
        Contact contact = (Contact)sessionFactory.getCurrentSession().load(Contact.class, id);
        if(null != contact){
            sessionFactory.getCurrentSession().delete(contact);
        }
    }

    @Override
    public void updateContact(Contact contact) {
        sessionFactory.getCurrentSession().update(contact);
    }
    
    
    
}
