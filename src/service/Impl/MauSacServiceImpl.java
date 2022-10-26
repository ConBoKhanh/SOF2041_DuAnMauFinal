/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import domainModel.MauSac;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.MauSacRepo;
import service.MauSacService;

/**
 *
 * @author ktkha
 */
public class MauSacServiceImpl implements MauSacService{
    
    private MauSacRepo msRepo = new MauSacRepo();

    @Override
    public List<MauSac> getList() {
        try {
            return msRepo.getList();
        } catch (SQLException ex) {
            Logger.getLogger(MauSacServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void add(MauSac ms) {
        try {
            msRepo.add(ms);
        } catch (SQLException ex) {
            Logger.getLogger(MauSacServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(MauSac ms, String Id) {
        try {
            msRepo.update(ms, Id);
        } catch (SQLException ex) {
            Logger.getLogger(MauSacServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String Id) {
        try {
            msRepo.delete(Id);
        } catch (SQLException ex) {
            Logger.getLogger(MauSacServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
