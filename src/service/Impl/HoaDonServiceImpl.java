/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import domainModel.HoaDon;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.HoaDonRepo;
import service.HoaDonService;
import viewModel.HoaDonViewModel;

/**
 *
 * @author ktkha
 */
public class HoaDonServiceImpl implements HoaDonService {

    private HoaDonRepo hdRepo = new HoaDonRepo();

    @Override
    public List<HoaDon> getList() {
        try {
            return hdRepo.getList();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void add(HoaDon h) {
        try {
            hdRepo.add(h);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(HoaDon h, String Id) {
        try {
            hdRepo.update(h, Id);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String Id) {
        try {
            hdRepo.delete(Id);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<HoaDonViewModel> getListHDBH() {
        try {
            return hdRepo.getListHDBH();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void addHoaDon(String date) {
        try {
            hdRepo.addHoaDon(date);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getMaxMa() {
        try {
            hdRepo.getMaxMa();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public void updateThanhToan(String Id) {
        try {
            hdRepo.updateThanhToan(Id);
        } catch (Exception e) {
        }
    }

    @Override
    public List<HoaDonViewModel> getListtt(int i) {
        try {
            return hdRepo.getListtt(i);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
