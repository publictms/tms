/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.hibernate.HibernateUtil;
import be.pxl.publictms.pojo.Facturatie;
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
public class FacturatieDAOImpl implements FacturatieDAO{
    @Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addFacturatie(Facturatie factuur) {
        sessionFactory.getCurrentSession().save(factuur);
    }

    @Override
    public Facturatie getFacturatie(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Facturatie where FacturatieId = :id");
        query.setParameter("id", id);
        return (Facturatie)query.list().get(0);
    }

    @Override
    public List<Facturatie> getFacturen(int klantId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Facturatie where KlantId = :id");
        query.setParameter("id", klantId);
        return query.list();
    }

    @Override
    public void deleteFactuur(int id) {
        Facturatie factuur = (Facturatie)sessionFactory.getCurrentSession().load(Facturatie.class, id);
        if(null != factuur){
            sessionFactory.getCurrentSession().delete(factuur);
        }
    }

    @Override
    public void updateFactuur(Facturatie factuur) {
        sessionFactory.getCurrentSession().update(factuur);
    }

    
    
}
