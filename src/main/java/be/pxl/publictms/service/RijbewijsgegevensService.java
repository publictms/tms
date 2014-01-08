/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.pojo.Rijbewijsgegevens;

/**
 *
 * @author Stijn
 */
public interface RijbewijsgegevensService {
    public void addRijbewijsgegevens(Rijbewijsgegevens rijbewijsgegevens);
    public Rijbewijsgegevens getRijbewijsgegevens(int id);
    public void deleteRijbewijsgegevens(int id);
    public void updateRijbewijsgegevens(Rijbewijsgegevens rijbewijsgegevens);
}
