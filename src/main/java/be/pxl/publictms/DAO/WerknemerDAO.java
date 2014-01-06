/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Werknemer;
import java.util.List;

/**
 *
 * @author 11302785
 */
public interface WerknemerDAO {
    public void addWerknemer(Werknemer werknemer);
    public List<Werknemer> getWerknemers();
    public void deleteWerknemer(int id);
    public void updateWerknemer(Werknemer werknemer);
}
