/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.hibernate.HibernateUtil;
import be.pxl.publictms.pojo.Rijbewijsgegevens;
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
public class RijbewijsgegevensDAOImpl implements RijbewijsgegevensDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addRijbewijsgegevens(Rijbewijsgegevens rijbewijsgegevens) {
        sessionFactory.getCurrentSession().save(rijbewijsgegevens);
    }

    @Override
    public Rijbewijsgegevens getRijbewijsgegevens(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Rijbewijsgegevens where RijbewijsId = :id");
        query.setParameter("id", id);
        return (Rijbewijsgegevens)query.list().get(0);
    }

    @Override
    public void deleteRijbewijsgegevens(int id) {
        Rijbewijsgegevens rijbewijsgegevens = (Rijbewijsgegevens)sessionFactory.getCurrentSession().load(Rijbewijsgegevens.class, id);
        if(null != rijbewijsgegevens){
            sessionFactory.getCurrentSession().delete(rijbewijsgegevens);
        }
    }

    @Override
    public void updateRijbewijsgegevens(Rijbewijsgegevens rijbewijsgegevens) {
        sessionFactory.getCurrentSession().update(rijbewijsgegevens);
    }
    
}
