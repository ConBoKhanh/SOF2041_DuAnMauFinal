/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.testIMPL;

import domainModel.HoaDon;
import java.util.List;
import viewModel.test.HoaDonViewModeltesst;

/**
 *
 * @author Admin
 */
public interface HoaDonIMPLTest {

    List<HoaDonViewModeltesst> getList();

    String add(HoaDon h);

    String update(String id);
}
