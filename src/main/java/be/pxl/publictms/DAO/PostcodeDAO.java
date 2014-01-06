/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Postcode;
import java.util.List;


/**
 *
 * @author 11302785
 */
public interface PostcodeDAO {
    public Postcode getGemeente(String id);
    public List<Postcode> getGemeente();
    public void addGemeente(Postcode postcode);
    public void updateGemeente(Postcode postcode);
    public void deleteGemeente(String id);
}
