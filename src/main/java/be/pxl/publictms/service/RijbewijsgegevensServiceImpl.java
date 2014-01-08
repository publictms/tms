/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.DAO.RijbewijsgegevensDAO;
import be.pxl.publictms.pojo.Rijbewijsgegevens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Stijn
 */
@Service
public class RijbewijsgegevensServiceImpl implements RijbewijsgegevensService{

    @Autowired
    private RijbewijsgegevensDAO rijbewijsgegevensDAO;
    
    @Override
    public void addRijbewijsgegevens(Rijbewijsgegevens rijbewijsgegevens) {
        rijbewijsgegevensDAO.addRijbewijsgegevens(rijbewijsgegevens);
    }

    @Override
    public Rijbewijsgegevens getRijbewijsgegevens(int id) {
        return rijbewijsgegevensDAO.getRijbewijsgegevens(id);
    }

    @Override
    public void deleteRijbewijsgegevens(int id) {
        rijbewijsgegevensDAO.deleteRijbewijsgegevens(id);
    }

    @Override
    public void updateRijbewijsgegevens(Rijbewijsgegevens rijbewijsgegevens) {
        rijbewijsgegevensDAO.updateRijbewijsgegevens(rijbewijsgegevens);
    }
    
}
