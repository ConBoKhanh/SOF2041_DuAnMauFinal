/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainModel.HoaDonChiTiet;
import java.util.List;
import viewModel.HoaDonChiTietViewModel;

/**
 *
 * @author ktkha
 */
public interface HoaDonChiTietService {

    List<HoaDonChiTiet> getHDCT();

    public void add(HoaDonChiTiet HDCT);

    public void delete(String IdHoaDon, String idCTSP);
    
    List<HoaDonChiTietViewModel> getGioHang(String Id);
    
    int getTongTien(String id);
    
}
