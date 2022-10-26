/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainModel.SanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ktkha
 */
public interface SanPhamService {

    List<SanPham> getListSP();

    public void add(SanPham sp);

    public void update(SanPham sp, String Id);

    public void delete(String Id);
}
