/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Actie;
import java.util.List;

/**
 *
 * @author Stijn
 */
public interface ActieDAO {
    public void addActie(Actie actie);
    public List<Actie> getActiesVanOpdracht(int id);
    public void deleteActie(int id);
    public void updateActie(Actie actie);
}
