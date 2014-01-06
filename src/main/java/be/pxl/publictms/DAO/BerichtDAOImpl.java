/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.hibernate.HibernateUtil;
import be.pxl.publictms.pojo.Bericht;
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
public class BerichtDAOImpl implements BerichtDAO{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void send(Bericht bericht) {
        sessionFactory.getCurrentSession().save(bericht);
    }

    @Override
    public List<Bericht> getBerichten(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Bericht where OntvangerId = :id");
        query.setParameter("id", id);
        return query.list();
    }

    @Override
    public void deleteBericht(int id) {
        Bericht bericht = (Bericht)sessionFactory.getCurrentSession().load(Bericht.class, id);
        if(null != bericht){
            sessionFactory.getCurrentSession().delete(bericht);
        }
    }
    
    
}
