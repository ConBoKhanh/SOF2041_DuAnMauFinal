/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainModel.NSX;
import java.util.List;

/**
 *
 * @author ktkha
 */
public interface NSXService {

    List<NSX> getList();
    
    public void add(NSX nsx);
    
     public void update(NSX nsx, String Id);
     
      public void delete(String Id);
    
}
