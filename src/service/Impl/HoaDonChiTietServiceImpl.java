/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import domainModel.HoaDonChiTiet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.HoaDonChiTietRepo;
import service.HoaDonChiTietService;
import viewModel.HoaDonChiTietViewModel;

/**
 *
 * @author ktkha
 */
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {

    private HoaDonChiTietRepo hdctRepo = new HoaDonChiTietRepo();

    @Override
    public List<HoaDonChiTiet> getHDCT() {
        try {
            return hdctRepo.getHDCT();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonChiTietServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void add(HoaDonChiTiet HDCT) {
        try {
            hdctRepo.add(HDCT);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonChiTietServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String IdHoaDon, String idCTSP) {
        try {
            hdctRepo.delete(IdHoaDon, idCTSP);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonChiTietServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<HoaDonChiTietViewModel> getGioHang(String Id) {
        try {
            return hdctRepo.getGioHang(Id);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonChiTietServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public int getTongTien(String id) {
         
        try {
            return hdctRepo.getTongTien(id);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonChiTietServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0; 
       
    }

}
