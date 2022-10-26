/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainModel.DongSP;
import java.util.List;

/**
 *
 * @author ktkha
 */
public interface DongSPService {
    List<DongSP> getList();
    
     public void add(DongSP dongSP);
     
     public void update(DongSP dongSP, String Id);
     
     public void delete(String Id);
}
