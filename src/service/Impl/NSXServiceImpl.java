/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import domainModel.DongSP;
import domainModel.NSX;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.NSXRepo;
import service.NSXService;

/**
 *
 * @author ktkha
 */
public class NSXServiceImpl implements NSXService{

    private NSXRepo nsx = new NSXRepo();

    @Override
    public List<NSX> getList() {
        try {
            return nsx.getList();
        } catch (SQLException ex) {
            Logger.getLogger(NSXServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void add(NSX nsx) {
        try {
            this.nsx.add(nsx);
        } catch (SQLException ex) {
            Logger.getLogger(NSXServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(NSX nsx, String Id) {
        try {
            this.nsx.update(nsx, Id);
        } catch (SQLException ex) {
            Logger.getLogger(NSXServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String Id) {
        try {
            this.nsx.delete(Id);
        } catch (SQLException ex) {
            Logger.getLogger(NSXServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
