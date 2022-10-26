/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.testIMPL;

import java.util.List;
import viewModel.test.cuaHangViewModel;

/**
 *
 * @author Admin
 */
public interface CuaHangIMPL {

    List<cuaHangViewModel> getList();

    boolean add(cuaHangViewModel ch);

    boolean delete(String Id);
    
    List<cuaHangViewModel> tim(String ten);
}
