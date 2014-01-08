/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.hibernate.HibernateUtil;
import be.pxl.publictms.pojo.Klant;
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
public class KlantDAOImpl implements KlantDAO{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addKlant(Klant klant) {
        sessionFactory.getCurrentSession().save(klant);
    }

    @Override
    public List<Klant> getKlanten() {
        return sessionFactory.getCurrentSession().createQuery("from Klant").list();
    }

    @Override
    public void deleteKlant(int id) {
        Klant klant = (Klant)sessionFactory.getCurrentSession().load(Klant.class, id);
        if(null != klant){
            sessionFactory.getCurrentSession().delete(klant);
        }
    }

    @Override
    public void updateKlant(Klant klant) {
        sessionFactory.getCurrentSession().update(klant);
    }

    @Override
    public Klant getKlant(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Klant where KlantId = :id");
        query.setParameter("id", id);
        return (Klant)query.list().get(0);
    }
    
    
    
}
