package service.Impl;


import domainModel.SanPham;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.SanPhamRepository;
import service.SanPhamService;
import service.SanPhamService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ktkha
 */
public class SanPhamServiceImpl implements SanPhamService{

    private SanPhamRepository SPRepo = new SanPhamRepository();

    @Override
    public List<SanPham> getListSP() {
        try {
            return SPRepo.getList();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
}

    @Override
    public void add(SanPham sp) {
        try {
            SPRepo.add(sp);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(SanPham sp, String Id) {
        try {
            SPRepo.update(sp, Id);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String Id) {
        try {
            SPRepo.delete(Id);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
