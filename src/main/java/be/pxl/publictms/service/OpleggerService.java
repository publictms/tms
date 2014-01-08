/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.pojo.Oplegger;
import java.util.List;

/**
 *
 * @author 11302785
 */
public interface OpleggerService {
    public void addOplegger(Oplegger oplegger);
    public List<Oplegger> getOpleggers();
    public Oplegger getOplegger(int id);
    public void deleteOpleggers(int id);
    public void updateOplegger(Oplegger oplegger);
}
