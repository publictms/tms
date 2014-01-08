/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.hibernate.HibernateUtil;
import be.pxl.publictms.pojo.Persoonsinfo;
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
public class PersoonsinfoDAOImpl implements PersoonsinfoDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void addPersoonsinfo(Persoonsinfo persoonsinfo) {
        sessionFactory.getCurrentSession().save(persoonsinfo);
    }

    @Override
    public Persoonsinfo getPersoonsinfo(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Persoonsinfo where InfoId = :id");
        query.setParameter("id", id);
        return (Persoonsinfo)query.list().get(0);
    }

    @Override
    public void deletePersoonsinfo(int id) {
        Persoonsinfo persoonsinfo = (Persoonsinfo)sessionFactory.getCurrentSession().load(Persoonsinfo.class, id);
        if(null != persoonsinfo){
            sessionFactory.getCurrentSession().delete(persoonsinfo);
        }
    }

    @Override
    public void updatePersoonsinfo(Persoonsinfo persoonsinfo) {
        sessionFactory.getCurrentSession().update(persoonsinfo);
    }

}
