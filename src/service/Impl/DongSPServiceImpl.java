/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import domainModel.DongSP;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.DongSPRepo;
import service.DongSPService;

/**
 *
 * @author ktkha
 */
public class DongSPServiceImpl implements DongSPService{

    private DongSPRepo dongSP = new DongSPRepo();
    @Override
    public List<DongSP> getList() {
        try {
            return dongSP.getList();
        } catch (SQLException ex) {
            Logger.getLogger(DongSPServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void add(DongSP dongSP) {
        try {
            this.dongSP.add(dongSP);
        } catch (SQLException ex) {
            Logger.getLogger(DongSPServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(DongSP dongSP, String Id) {
        try {
            this.dongSP.update(dongSP, Id);
        } catch (SQLException ex) {
            Logger.getLogger(DongSPServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String Id) {
        try {
            dongSP.delete(Id);
        } catch (SQLException ex) {
            Logger.getLogger(DongSPServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
