/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import viewModel.SanPhamBanHang;

/**
 *
 * @author ktkha
 */
public interface SanPhamBanHangService {
     public List<SanPhamBanHang> getListSP();
    
     boolean update(String Id, int soLuong);
}
