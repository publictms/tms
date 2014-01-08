/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.pojo.Transportadres;

/**
 *
 * @author Stijn
 */
public interface TransportadresService {
    public void addTransportadres(Transportadres transportadres);
    public Transportadres getTransportadres(int id);
    public void deleteTransportadres(int id);
    public void updateTransportadres(Transportadres transportadres);
}
