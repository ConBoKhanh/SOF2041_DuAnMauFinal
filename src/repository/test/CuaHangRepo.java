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
import viewModel.test.cuaHangViewModel;

/**
 *
 * @author Admin
 */
public class CuaHangRepo {

    public List<cuaHangViewModel> getList() {
        List<cuaHangViewModel> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "SELECT Id,Ma,Ten,DiaChi,ThanhPho,QuocGia from CuaHang order by ma asc";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new cuaHangViewModel(rs.getString("Id"),
                        rs.getString("Ma"),
                        rs.getString("Ten"),
                        rs.getString("DiaChi"),
                        rs.getString("ThanhPho"),
                        rs.getString("QuocGia")
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<cuaHangViewModel> tim(String ten) {
        List<cuaHangViewModel> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
                String sql = "SELECT Id,Ma,Ten,DiaChi,ThanhPho,QuocGia from CuaHang where Ten LIKE '%"+ten+"%' order by ma asc";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new cuaHangViewModel(rs.getString("Id"),
                        rs.getString("Ma"),
                        rs.getString("Ten"),
                        rs.getString("DiaChi"),
                        rs.getString("ThanhPho"),
                        rs.getString("QuocGia")
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<cuaHangViewModel> timGioiTinh(String ten) {
        List<cuaHangViewModel> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
                String sql = "SELECT Id,Ma,Ten,DiaChi,ThanhPho,QuocGia from CuaHang where Ten LIKE '%"+ten+"%' order by ma asc";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new cuaHangViewModel(rs.getString("Id"),
                        rs.getString("Ma"),
                        rs.getString("Ten"),
                        rs.getString("DiaChi"),
                        rs.getString("ThanhPho"),
                        rs.getString("QuocGia")
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public boolean add(cuaHangViewModel ch) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "insert into CuaHang(Ma,Ten,DiaChi,ThanhPho,QuocGia) Values (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ch.getMa());
            ps.setString(2, ch.getTen());
            ps.setString(3, ch.getDiachi());
            ps.setString(4, ch.getThanhpho());
            ps.setString(5, ch.getQuocgia());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean delete(String Id) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "delete From CuaHang where Id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
