/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.hibernate.HibernateUtil;
import be.pxl.publictms.pojo.Laadgegevens;
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
public class LaadGegevensDAOImpl implements LaadGegevensDAO{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addLaadgegevens(Laadgegevens laadgegevens) {
        sessionFactory.getCurrentSession().save(laadgegevens);
    }

    @Override
    public Laadgegevens getLaadgegevens(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from LaadGegevens where LaadId = :id");
        query.setParameter("id", id);
        return (Laadgegevens)query.list().get(0);
    }

    @Override
    public void deleteLaadgegeven(int id) {
        Laadgegevens laadGegevens = (Laadgegevens)sessionFactory.getCurrentSession().load(Laadgegevens.class, id);
        if(null != laadGegevens){
            sessionFactory.getCurrentSession().delete(laadGegevens);
        }
    }

    @Override
    public void updateLaadgegeven(Laadgegevens laadgegevens) {
        sessionFactory.getCurrentSession().update(laadgegevens);
    }
}
