/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Gebruiker;

import java.util.List;

/**
 *
 * @author 11302785
 */
public interface GebruikerDAO {
    public void addGebruiker(Gebruiker gebruiker);
    public List<Gebruiker> getGebruikers();
    public void deleteGebruiker(int id);
    public void updateGebruiker(Gebruiker gebruiker);
}
