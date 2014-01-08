/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.hibernate.HibernateUtil;
import be.pxl.publictms.pojo.Transportadres;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Stijn
 */
@Repository
public class TransportadresDAOImpl implements TransportadresDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void addTransportadres(Transportadres transportadres) {
        sessionFactory.getCurrentSession().save(transportadres);
    }

    @Override
    public Transportadres getTransportadres(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Transportadres where TransportadresId = :id");
        query.setParameter("id", id);
        return (Transportadres)query.list().get(0);
    }

    @Override
    public void deleteTransportadres(int id) {
        Transportadres transportadres = (Transportadres)sessionFactory.getCurrentSession().load(Transportadres.class, id);
        if(null != transportadres){
            sessionFactory.getCurrentSession().delete(transportadres);
        }
    }

    @Override
    public void updateTransportadres(Transportadres transportadres) {
        sessionFactory.getCurrentSession().update(transportadres);
    }
    
}
