/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.DAO.TaalDAO;
import be.pxl.publictms.pojo.Taal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Stijn
 */
@Service
public class TaalServiceImpl implements TaalService{

    @Autowired
    private TaalDAO taalDAO;
    
    @Transactional
    public void addTaal(Taal taal) {
        taalDAO.addTaal(taal);
    }

    @Transactional
    public Taal getTaal(int id) {
        return taalDAO.getTaal(id);
    }

    @Transactional
    public void deleteTaal(int id) {
        taalDAO.deleteTaal(id);
    }

    @Transactional
    public void updateTaal(Taal taal) {
        taalDAO.updateTaal(taal);
    }
    
}
