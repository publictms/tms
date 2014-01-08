/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.hibernate.HibernateUtil;
import be.pxl.publictms.pojo.Taal;
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
public class TaalDAOImpl implements TaalDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addTaal(Taal taal) {
        sessionFactory.getCurrentSession().save(taal);
    }

    @Override
    public Taal getTaal(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Taal where TaalId = :id");
        query.setParameter("id", id);
        return (Taal)query.list().get(0);
    }

    @Override
    public void deleteTaal(int id) {
        Taal taal = (Taal)sessionFactory.getCurrentSession().load(Taal.class, id);
        if(null != taal){
            sessionFactory.getCurrentSession().delete(taal);
        }
    }

    @Override
    public void updateTaal(Taal taal) {
        sessionFactory.getCurrentSession().update(taal);
    }
}
