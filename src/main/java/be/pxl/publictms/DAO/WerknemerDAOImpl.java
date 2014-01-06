/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Werknemer;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 11302785
 */
@Repository
public class WerknemerDAOImpl implements WerknemerDAO{
    @Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addWerknemer(Werknemer werknemer) {
        sessionFactory.getCurrentSession().save(werknemer);
    }

    @Override
    public List<Werknemer> getWerknemers() {
        return sessionFactory.getCurrentSession().createQuery("from Werknemer").list();
    }

    @Override
    public void deleteWerknemer(int id) {
        Werknemer werknemer = (Werknemer)sessionFactory.getCurrentSession().load(Werknemer.class, id);
        if(null != werknemer){
            sessionFactory.getCurrentSession().delete(werknemer);
        }
    }

    @Override
    public void updateWerknemer(Werknemer werknemer) {
        sessionFactory.getCurrentSession().update(werknemer);
    }
    
    
   
}
