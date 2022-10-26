/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl.CuaHangService;

import domainModel.HoaDon;
import java.util.ArrayList;
import java.util.List;
import repository.test.HoaDonRepoTest;
import service.testIMPL.HoaDonIMPLTest;
import viewModel.test.HoaDonViewModeltesst;

/**
 *
 * @author Admin
 */
public class HoaDonServiceTest implements HoaDonIMPLTest{
    private HoaDonRepoTest i = new HoaDonRepoTest();
    @Override
    public List<HoaDonViewModeltesst> getList() {
        List<HoaDonViewModeltesst> listsview = new ArrayList<>();
        List<HoaDon> list = i.getList();
        for (HoaDon i : list) {
            listsview.add(new HoaDonViewModeltesst(i.getId(),
                    i.getMa(), i.getDiaChi(),
                    i.getSDT(),i.getTinhTrang()==0?"Chưa Thanh Toán":"Đã Thanh Toán"));
        }
        
        return listsview;
    }

    @Override
    public String add(HoaDon h) {
        // check ma trun
        boolean b = false;
        List<HoaDonViewModeltesst> list = getList();
        for (HoaDonViewModeltesst i : list) {
            if(h.getMa().equals(i.getMa())){
                b = true;
            }
        }
        
        
        // tim ma
        String validate = null;
        // ma
        if(h.getMa().equals("")){
            validate = "Mã Rỗng";
        }else if(!h.getMa().matches("^[0-9]+")){
            validate = "Mã chỉ số nguyên oke";
        }else if(h.getMa().length()>20){
            validate = "Mã Không qúa 20 kí tự";
        }
 
        // dia chi
        else if(h.getDiaChi().equals("")){
            validate = "Địa Chỉ Rỗng";
        }else if(!h.getDiaChi().matches("^[a-zA-Z0-9 ]+")){
            validate = "Địa chỉ phải là số nguyên và chữ";
        }else if(h.getDiaChi().length()>20){
            validate = "Địa chỉ Không qúa 20 kí tự";
        }
        
        
        // sdt
        else if(h.getSDT().equals("")){
            validate = "Số điện thoại Rỗng";
        
        } else if(!h.getSDT().matches("^[0{1-9}{1}[0-9]{8}]+")){
            validate = "số thứ thự đúng form 0(1-9)xxxxxxxx";
        }else if(h.getSDT().length()>10){
            validate = "số điện thoại Không qúa 10 kí tự";
        }   
        // ma trung
        else if(b==true){
            validate = "Mã Trùng";
        }
        // soluong ki tu validate
        
        // add thanh cong
        else{
            i.add(h);
            validate = "oke";
        }
        
       
        return validate;
    }

    @Override
    public String update(String id) {
        String validate = null;
        if(id.equals("id")){
            validate = "id Rỗng";
        }else{
            i.update(id);
            validate = "Thành Công";
        }
        return validate;
    }
    
    
}
