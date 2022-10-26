/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utilities.DBContext;
import viewModel.test.NhanVienViewModel;

/**
 *
 * @author Admin
 */
public class NhanVienRepo {

    public List<NhanVienViewModel> list() {
        List<NhanVienViewModel> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select Id,Ma,Ten,TenDem,Ho,GioiTinh,Sdt from NhanVien";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new NhanVienViewModel(
                        rs.getString("Id"),
                        rs.getString("Ma"),
                        rs.getString("Ten"),
                        rs.getString("TenDem"),
                        rs.getString("Ho"),
                        rs.getString("GioiTinh"),
                        rs.getString("Sdt")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public boolean add(NhanVienViewModel nv) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Insert into NhanVien (Ma,Ten,TenDem,Ho,GioiTinh,Sdt) Values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getTen());
            ps.setString(3, nv.getTenDem());
            ps.setString(4, nv.getHo());
            ps.setString(5, nv.getGioiTinh());
            ps.setString(6, nv.getSdt());

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public List<NhanVienViewModel> timKiem(String ma) {
        List<NhanVienViewModel> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select Id,Ma,Ten,TenDem,Ho,GioiTinh,Sdt from NhanVien where Ma Like '%"+ ma +"%'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new NhanVienViewModel(
                        rs.getString("Id"),
                        rs.getString("Ma"),
                        rs.getString("Ten"),
                        rs.getString("TenDem"),
                        rs.getString("Ho"),
                        rs.getString("GioiTinh"),
                        rs.getString("Sdt")));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<NhanVienViewModel> timKiemgt(String ma) {
        List<NhanVienViewModel> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select Id,Ma,Ten,TenDem,Ho,GioiTinh,Sdt from NhanVien where GioiTinh Like '"+ ma +"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new NhanVienViewModel(
                        rs.getString("Id"),
                        rs.getString("Ma"),
                        rs.getString("Ten"),
                        rs.getString("TenDem"),
                        rs.getString("Ho"),
                        rs.getString("GioiTinh"),
                        rs.getString("Sdt")));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public static void main(String[] args) {
        NhanVienRepo i = new NhanVienRepo();
           List<NhanVienViewModel> list  = i.timKiemgt("Nam");
           for (NhanVienViewModel nhanVienViewModel : list) {
               System.out.println(nhanVienViewModel.toString());
        }
    }
}
