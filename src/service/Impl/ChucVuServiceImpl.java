/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import domainModel.ChucVu;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.ChucVuRepo;
import service.ChucVuService;

/**
 *
 * @author ktkha
 */
public class ChucVuServiceImpl implements ChucVuService{
    private ChucVuRepo cvRepo = new ChucVuRepo();

    @Override
    public List<ChucVu> getList() {
        try {
            return cvRepo.getList();
        } catch (SQLException ex) {
            Logger.getLogger(ChucVuServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void add(ChucVu cv) {
        try {
            cvRepo.add(cv);
        } catch (SQLException ex) {
            Logger.getLogger(ChucVuServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ChucVu cv, String Id) {
        try {
            cvRepo.update(cv, Id);
        } catch (SQLException ex) {
            Logger.getLogger(ChucVuServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String Id) {
        try {
            cvRepo.delete(Id);
        } catch (SQLException ex) {
            Logger.getLogger(ChucVuServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
