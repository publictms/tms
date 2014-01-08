/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.hibernate.HibernateUtil;
import be.pxl.publictms.pojo.Actie;
import java.util.List;
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
public class ActieDAOImpl implements ActieDAO{
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void addActie(Actie actie) {
        sessionFactory.getCurrentSession().save(actie);
    }

    @Override
    public List<Actie> getActiesVanOpdracht(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Actie where OpdrachtId = :id");
        query.setParameter("id", id);
        return query.list();
    }

    @Override
    public void deleteActie(int id) {
        Actie actie = (Actie)sessionFactory.getCurrentSession().load(Actie.class, id);
        if(null != actie){
            sessionFactory.getCurrentSession().delete(actie);
        }
    }

    @Override
    public void updateActie(Actie actie) {
        sessionFactory.getCurrentSession().update(actie);
    }
    
}
