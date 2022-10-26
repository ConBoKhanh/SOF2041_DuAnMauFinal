/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.SanPhamBanHangRepo;
import service.SanPhamBanHangService;
import viewModel.SanPhamBanHang;

/**
 *
 * @author ktkha
 */
public class SanPhamBanHangServiceImpl implements SanPhamBanHangService {

    private SanPhamBanHangRepo spRepo = new SanPhamBanHangRepo();

    @Override
    public List<SanPhamBanHang> getListSP() {
        try {
            return spRepo.getListSP();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamBanHangServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean update(String Id, int soLuong) {
        spRepo.update(Id, soLuong);
        return true;
    }

}
