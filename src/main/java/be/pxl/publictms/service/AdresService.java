/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxl.publictms.service;

import be.pxl.publictms.pojo.Adres;

/**
 *
 * @author 11302785
 */
public interface AdresService {
    public void addAdres(Adres adres);
    public Adres getAdres(int id);
    public void deleteAdres(int id);
    public void updateAdres(Adres adres);
}
