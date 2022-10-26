/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainModel.NhanVien;
import java.util.List;

/**
 *
 * @author ktkha
 */
public interface NhanVienService {
    List<NhanVien> getListNV();
    
    public void add(NhanVien nv);
    
    public void update(NhanVien nv, String Id);
    
    public void delete(String Id);
}
