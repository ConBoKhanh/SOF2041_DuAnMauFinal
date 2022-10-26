/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl.CuaHangService;

import java.util.List;
import repository.test.NhanVienRepo;
import service.testIMPL.NhanVienInterface;
import viewModel.test.NhanVienViewModel;
import viewModel.test.cuaHangViewModel;

/**
 *
 * @author Admin
 */
public class NhanVienService implements NhanVienInterface {

    private NhanVienRepo i = new NhanVienRepo();

    @Override
    public List<NhanVienViewModel> list() {
        return i.list();
    }

    @Override
    public String add(NhanVienViewModel nv) {
        String validate = null;
        if (nv.getMa().equals("")) {
            validate = "Mã Rỗng";

        } else if (nv.getTen().equals("")) {
            validate = "Tên Rỗng";
        } else {
            i.add(nv);
            validate = "ADD thành công";
        }

        return validate;
    }

    @Override
    public List<NhanVienViewModel> timKiem(String ma) {
        return i.timKiem(ma);
    }

    @Override
    public List<NhanVienViewModel> timGioiTinh(String ten) {
        return i.timKiemgt(ten);
    }

}
