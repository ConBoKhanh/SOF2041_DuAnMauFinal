/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import domainModel.NhanVien;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.NhanVienRepo;
import service.NhanVienService;

/**
 *
 * @author ktkha
 */
public class NhanVienServiceImpl implements NhanVienService{
    
    private NhanVienRepo nvRepo = new NhanVienRepo();

    @Override
    public List<NhanVien> getListNV() {
        try {
            return nvRepo.getList();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void add(NhanVien nv) {
        try {
            nvRepo.add(nv);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(NhanVien nv, String Id) {
        try {
            nvRepo.update(nv, Id);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String Id) {
        try {
            nvRepo.delete(Id);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
