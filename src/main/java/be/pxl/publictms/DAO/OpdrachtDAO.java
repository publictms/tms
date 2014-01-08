/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Opdracht;
import java.util.List;

/**
 *
 * @author Stijn
 */
public interface OpdrachtDAO {
    public void addOpdracht(Opdracht opdracht);
    public List<Opdracht> getOpdracht();
    public void deleteOpdracht(int id);
    public void updateOpdracht(Opdracht opdracht);
}
