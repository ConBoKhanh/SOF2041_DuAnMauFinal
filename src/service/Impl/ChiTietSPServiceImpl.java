/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import domainModel.ChiTietSP;
import domainModel.SanPham;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.ChiTietSPRepo;
import service.ChiTietSPService;

/**
 *
 * @author ktkha
 */
public class ChiTietSPServiceImpl implements ChiTietSPService{
    
    private ChiTietSPRepo ctspRepo = new ChiTietSPRepo();

    @Override
    public List<ChiTietSP> getCTSP() {
        try {
            return ctspRepo.getCTSP();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void add(ChiTietSP ctsp) {
        try {
            ctspRepo.add(ctsp);
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ChiTietSP ctsp, String Id) {
        try {
            ctspRepo.update(ctsp, Id);
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String Id) {
        try {
            ctspRepo.delete(Id);
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<SanPham> getListSP() {
        try {
            return ctspRepo.getListSP();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

 
}
