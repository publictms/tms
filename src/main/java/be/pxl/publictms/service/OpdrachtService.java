/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.pojo.Opdracht;
import java.util.List;

/**
 *
 * @author Stijn
 */
public interface OpdrachtService {
    public void addOpdracht(Opdracht opdracht);
    public List<Opdracht> getOpdracht();
    public void deleteOpdracht(int id);
    public void updateOpdracht(Opdracht opdracht);
}
