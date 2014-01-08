/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Taal;

/**
 *
 * @author Stijn
 */
public interface TaalDAO {
    public void addTaal(Taal taal);
    public Taal getTaal(int id);
    public void deleteTaal(int id);
    public void updateTaal(Taal taal);
}
