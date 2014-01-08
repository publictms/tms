/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Laadgegevens;

/**
 *
 * @author 11302785
 */
public interface LaadGegevensDAO {
    public void addLaadgegevens(Laadgegevens laadgegevens);
    public Laadgegevens getLaadgegevens(int id);
    public void deleteLaadgegeven(int id);
    public void updateLaadgegeven(Laadgegevens laadgegevens);
}
