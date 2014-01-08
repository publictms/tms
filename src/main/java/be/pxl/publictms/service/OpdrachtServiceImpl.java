/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.DAO.OpdrachtDAO;
import be.pxl.publictms.pojo.Opdracht;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Stijn
 */
@Service
public class OpdrachtServiceImpl implements OpdrachtService{

    @Autowired
    private OpdrachtDAO opdrachtDAO;
            
    @Transactional
    public void addOpdracht(Opdracht opdracht) {
        opdrachtDAO.addOpdracht(opdracht);
    }

    @Transactional
    public List<Opdracht> getOpdracht() {
        return opdrachtDAO.getOpdracht();
    }

    @Transactional
    public void deleteOpdracht(int id) {
        opdrachtDAO.deleteOpdracht(id);
    }

    @Transactional
    public void updateOpdracht(Opdracht opdracht) {
        opdrachtDAO.updateOpdracht(opdracht);
    }
    
}
