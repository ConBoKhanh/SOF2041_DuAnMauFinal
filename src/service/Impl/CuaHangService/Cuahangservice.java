/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl.CuaHangService;

import java.util.List;
import repository.test.CuaHangRepo;
import service.testIMPL.CuaHangIMPL;
import viewModel.test.cuaHangViewModel;

/**
 *
 * @author Admin
 */
public class Cuahangservice implements CuaHangIMPL {

    private CuaHangRepo i = new CuaHangRepo();

    @Override
    public List<cuaHangViewModel> getList() {
        return i.getList();
    }

    @Override
    public boolean add(cuaHangViewModel ch) {
        try {
            return i.add(ch);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(String Id) {
        try {
            return i.delete(Id);
        } catch (Exception e) {
            return false;
        }
    }

@Override
    public List<cuaHangViewModel> tim(String ten) {
        return i.tim(ten);
    }

}
