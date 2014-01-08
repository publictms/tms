/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.pojo.Facturatie;
import java.util.List;

/**
 *
 * @author 11302785
 */
public interface FacturatieService {
    public void addFacturatie(Facturatie factuur);
    public Facturatie getFacturatie(int id);
    public List<Facturatie> getFacturen(int klantId);
    public void deleteFactuur(int id);
    public void updateFactuur(Facturatie factuur);
}
