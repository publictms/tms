/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.pojo.Persoonsinfo;

/**
 *
 * @author Stijn
 */
public interface PersoonsinfoService {
    public void addPersoonsinfo(Persoonsinfo persoonsinfo);
    public Persoonsinfo getPersoonsinfo(int id);
    public void deletePersoonsinfo(int id);
    public void updatePersoonsinfo(Persoonsinfo persoonsinfo);
}
