/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.hibernate.HibernateUtil;
import be.pxl.publictms.pojo.Adres;
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
public class AdresDAOImpl implements AdresDAO{
    @Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addAdres(Adres adres) {
        sessionFactory.getCurrentSession().save(adres);
    }

    @Override
    public Adres getAdres(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Adres where AdresId = :id");
        query.setParameter("id", id);
        return (Adres)query.list().get(0);
    }

    @Override
    public void deleteAdres(int id) {
        Adres adres = (Adres)sessionFactory.getCurrentSession().load(Adres.class, id);
        if(null != adres){
            sessionFactory.getCurrentSession().delete(adres);
        }
    }

    @Override
    public void updateAdres(Adres adres) {
        sessionFactory.getCurrentSession().update(adres);
    }
    
}
