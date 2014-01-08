/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.DAO;

import be.pxl.publictms.pojo.Voertuig;
import java.util.List;

/**
 *
 * @author Stijn
 */
public interface VoertuigDAO {
    public void addVoertuig(Voertuig voertuig);
    public List<Voertuig> getVoertuigen();
    public Voertuig getVoertuig(int id);
    public void deleteVoertuig(int id);
    public void updateVoertuig(Voertuig voertuig);
}
