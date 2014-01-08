/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.DAO.PersoonsinfoDAO;
import be.pxl.publictms.pojo.Persoonsinfo;
import be.pxl.publictms.pojo.Taal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Stijn
 */
@Service
public class PersoonsinfoServiceImpl implements PersoonsinfoService{

    @Autowired
    private PersoonsinfoDAO persoonsinfoDAO;

    @Override
    public void addPersoonsinfo(Persoonsinfo persoonsinfo) {
        persoonsinfoDAO.addPersoonsinfo(persoonsinfo);
    }

    @Override
    public Persoonsinfo getPersoonsinfo(int id) {
        return persoonsinfoDAO.getPersoonsinfo(id);
    }

    @Override
    public void deletePersoonsinfo(int id) {
        persoonsinfoDAO.deletePersoonsinfo(id);
    }

    @Override
    public void updatePersoonsinfo(Persoonsinfo persoonsinfo) {
        persoonsinfoDAO.updatePersoonsinfo(persoonsinfo);
    }
    
}
