/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.DAO.TaalDAO;
import be.pxl.publictms.pojo.Taal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Stijn
 */
@Service
public class TaalServiceImpl implements TaalService{

    @Autowired
    private TaalDAO taalDAO;
    
    @Override
    public void addTaal(Taal taal) {
        taalDAO.addTaal(taal);
    }

    @Override
    public Taal getTaal(int id) {
        return taalDAO.getTaal(id);
    }

    @Override
    public void deleteTaal(int id) {
        taalDAO.deleteTaal(id);
    }

    @Override
    public void updateTaal(Taal taal) {
        taalDAO.updateTaal(taal);
    }
    
}
