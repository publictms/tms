/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Opdracht;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Stijn
 */
@Repository
public class OpdrachtDAOImpl implements OpdrachtDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void addOpdracht(Opdracht opdracht) {
        sessionFactory.getCurrentSession().save(opdracht);
    }

    @Override
    public List<Opdracht> getOpdracht() {
        return sessionFactory.getCurrentSession().createQuery("from Opdracht").list();
    }

    @Override
    public void deleteOpdracht(int id) {
        Opdracht opdracht = (Opdracht)sessionFactory.getCurrentSession().load(Opdracht.class, id);
        if(null != opdracht){
            sessionFactory.getCurrentSession().delete(opdracht);
        }
    }

    @Override
    public void updateOpdracht(Opdracht opdracht) {
        sessionFactory.getCurrentSession().update(opdracht);
    }
    
}
