/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Transportadres;

/**
 *
 * @author Stijn
 */
public interface TransportadresDAO {
    public void addTransportadres(Transportadres transportadres);
    public Transportadres getTransportadres(int id);
    public void deleteTransportadres(int id);
    public void updateTransportadres(Transportadres transportadres);
}
