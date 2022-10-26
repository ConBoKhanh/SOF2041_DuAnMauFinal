/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainModel.ChiTietSP;
import domainModel.SanPham;
import java.util.List;

/**
 *
 * @author ktkha
 */
public interface ChiTietSPService {

    List<ChiTietSP> getCTSP();

    public void add(ChiTietSP ctsp);

    public void update(ChiTietSP ctsp, String Id);

    public void delete(String Id);
    
    List<SanPham> getListSP();

}
