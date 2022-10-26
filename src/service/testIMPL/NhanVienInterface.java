/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.testIMPL;

import java.util.List;
import viewModel.test.NhanVienViewModel;
import viewModel.test.cuaHangViewModel;

/**
 *
 * @author Admin
 */
public interface NhanVienInterface {

    List<NhanVienViewModel> list();

    String add(NhanVienViewModel nv);

    List<NhanVienViewModel> timKiem(String ma);
    
    List<NhanVienViewModel> timGioiTinh(String ten);
}
