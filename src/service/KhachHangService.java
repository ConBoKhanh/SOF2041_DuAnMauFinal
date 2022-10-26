/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainModel.KhachHang;
import java.util.List;

/**
 *
 * @author ktkha
 */
public interface KhachHangService {
    List<KhachHang> getList();
    
    public void add(KhachHang kh);
    
    public void update(KhachHang kh, String Id);
    
    public void delete(String Id);
}
