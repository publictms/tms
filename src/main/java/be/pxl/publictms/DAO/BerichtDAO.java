/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Bericht;
import java.util.List;

/**
 *
 * @author 11302785
 */
public interface BerichtDAO {
    public void send(Bericht bericht);
    public List<Bericht> getBerichten(int id);
    public void deleteBericht(int id);
}
