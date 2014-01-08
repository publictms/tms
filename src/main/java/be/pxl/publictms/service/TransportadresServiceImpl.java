/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.DAO.PostcodeDAO;
import be.pxl.publictms.DAO.TransportadresDAO;
import be.pxl.publictms.pojo.Transportadres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Stijn
 */
@Service
public class TransportadresServiceImpl implements TransportadresService{

    @Autowired
    private TransportadresDAO transportadresDAO;
     
    @Override
    public void addTransportadres(Transportadres transportadres) {
        transportadresDAO.addTransportadres(transportadres);
    }

    @Override
    public Transportadres getTransportadres(int id) {
        return transportadresDAO.getTransportadres(id);
    }

    @Override
    public void deleteTransportadres(int id) {
        transportadresDAO.deleteTransportadres(id);
    }

    @Override
    public void updateTransportadres(Transportadres transportadres) {
        transportadresDAO.updateTransportadres(transportadres);
    }
    
}
