/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainModel.MauSac;
import java.util.List;

/**
 *
 * @author ktkha
 */
public interface MauSacService {
    
    List<MauSac> getList();
    
    public void add(MauSac ms);
    
    public void update(MauSac ms, String Id);
    
    public void delete(String Id);
}
