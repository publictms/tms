/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Gebruiker;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 11302785
 */
@Repository
public class GebruikerDAOImpl implements GebruikerDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void addGebruiker(Gebruiker gebruiker) {
        sessionFactory.getCurrentSession().save(gebruiker);
    }

    @Override
    public List<Gebruiker> getGebruikers() {
        return sessionFactory.getCurrentSession().createQuery("from Gebruiker").list();
    }

    @Override
    public void deleteGebruiker(int id) {
        Gebruiker gebruiker = (Gebruiker)sessionFactory.getCurrentSession().load(Gebruiker.class, id);
        if(null != gebruiker){
            sessionFactory.getCurrentSession().delete(gebruiker);
        }
    }

    @Override
    public void updateGebruiker(Gebruiker gebruiker) {
        sessionFactory.getCurrentSession().update(gebruiker);
    }
    
}
