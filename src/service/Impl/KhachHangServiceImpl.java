package service.Impl;


import domainModel.KhachHang;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.KhachHangRepo;
import service.KhachHangService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ktkha
 */
public class KhachHangServiceImpl implements KhachHangService{
    
    private KhachHangRepo khRepo = new KhachHangRepo();

    @Override
    public List<KhachHang> getList() {
        try {
            return khRepo.getList();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void add(KhachHang kh) {
        try {
            khRepo.add(kh);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(KhachHang kh, String Id) {
        try {
            khRepo.update(kh, Id);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String Id) {
        try {
            khRepo.delete(Id);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
