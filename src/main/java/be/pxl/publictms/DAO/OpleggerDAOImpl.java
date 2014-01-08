/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.hibernate.HibernateUtil;
import be.pxl.publictms.pojo.Oplegger;
import java.util.List;
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
public class OpleggerDAOImpl implements OpleggerDAO{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addOplegger(Oplegger oplegger) {
        sessionFactory.getCurrentSession().save(oplegger);
    }

    @Override
    public List<Oplegger> getOpleggers() {
        return sessionFactory.getCurrentSession().createQuery("from Oplegger").list();
    }

    @Override
    public Oplegger getOplegger(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Oplegger where OpleggerId = :id");
        query.setParameter("id", id);
        return (Oplegger)query.list().get(0);
    }

    @Override
    public void deleteOpleggers(int id) {
        Oplegger oplegger = (Oplegger)sessionFactory.getCurrentSession().load(Oplegger.class, id);
        if(null != oplegger){
            sessionFactory.getCurrentSession().delete(oplegger);
        }
    }

    @Override
    public void updateOplegger(Oplegger oplegger) {
        sessionFactory.getCurrentSession().update(oplegger);
    }
    
    
}
