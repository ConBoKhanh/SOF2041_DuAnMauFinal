/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainModel.CuaHang;
import java.util.List;

/**
 *
 * @author ktkha
 */
public interface CuaHangService {
    List<CuaHang> getList();
    
    public void add(CuaHang ch);
    
    public void update(CuaHang ch, String Id);
    
    public void delete(String Id);
    
}
