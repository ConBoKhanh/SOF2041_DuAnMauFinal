/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import domainModel.CuaHang;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.CuaHangRepo;
import service.CuaHangService;

/**
 *
 * @author ktkha
 */
public class CuaHangServiceImpl implements CuaHangService{
    
    private CuaHangRepo chRepo = new CuaHangRepo();

    @Override
    public List<CuaHang> getList() {
        try {
            return chRepo.getList();
        } catch (SQLException ex) {
            Logger.getLogger(CuaHangServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void add(CuaHang ch) {
        try {
            chRepo.add(ch);
        } catch (SQLException ex) {
            Logger.getLogger(CuaHangServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(CuaHang ch, String Id) {
        try {
            chRepo.update(ch, Id);
        } catch (SQLException ex) {
            Logger.getLogger(CuaHangServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String Id) {
        try {
            chRepo.delete(Id);
        } catch (SQLException ex) {
            Logger.getLogger(CuaHangServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
