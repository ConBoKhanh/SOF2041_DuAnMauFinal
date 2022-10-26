/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainModel.HoaDon;
import java.util.List;
import viewModel.HoaDonViewModel;

/**
 *
 * @author ktkha
 */
public interface HoaDonService {

    List<HoaDon> getList();

    public void add(HoaDon h);

    public void update(HoaDon h, String Id);

    public void delete(String Id);
    
    List<HoaDonViewModel> getListHDBH();
    
    public void addHoaDon(String date);
    
    int getMaxMa();
    
    public void updateThanhToan(String Id);
    
     List<HoaDonViewModel> getListtt(int i);
    
}
