/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.pojo.Klant;
import java.util.List;

/**
 *
 * @author 11302785
 */
public interface KlantService {
    public void addKlant(Klant klant);
    public List<Klant> getKlanten();
    public Klant getKlant(int id);
    public void deleteKlant(int id);
    public void updateKlant(Klant klant); 
}
