/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.hibernate.HibernateUtil;
import be.pxl.publictms.pojo.Postcode;
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
public class PostcodeDAOImpl implements PostcodeDAO{
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public Postcode getGemeente(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Postcode where postcode = :id");
        query.setParameter("id", id);
        return (Postcode)query.list().get(0);
    }
    
    @Override
    public List<Postcode> getGemeente(){
        return sessionFactory.getCurrentSession().createQuery("from Postcode").list();
    }
    
    @Override
    public void addGemeente(Postcode postcode) {
        sessionFactory.getCurrentSession().save(postcode);
    }

    @Override
    public void updateGemeente(Postcode postcode) {
        sessionFactory.getCurrentSession().update(postcode);
    }

    @Override
    public void deleteGemeente(String id) {
        Postcode postcode = (Postcode)sessionFactory.getCurrentSession().load(Postcode.class, id);
        if(null != postcode){
            sessionFactory.getCurrentSession().delete(postcode);
        }
    }
    
    
}
