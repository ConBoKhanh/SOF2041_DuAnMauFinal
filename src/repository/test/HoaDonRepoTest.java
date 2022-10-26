/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.test;

import domainModel.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utilities.DBContext;

/**
 *
 * @author Admin
 */
public class HoaDonRepoTest {

    public List<HoaDon> getList() {
        List<HoaDon> list = new ArrayList<>();

        try {
            Connection conn = DBContext.getConnection();
            String sql = "SELECT Id,Ma,DiaChi,Sdt,TinhTrang From HoaDon";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon h = new HoaDon();
                h.setId(rs.getString("Id"));
                h.setMa(rs.getString("Ma"));
                h.setDiaChi(rs.getString("DiaChi"));
                h.setSDT(rs.getString("Sdt"));
                h.setTinhTrang(rs.getInt("TinhTrang"));

                list.add(h);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public boolean add(HoaDon h) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Insert into HoaDon(Ma,DiaChi,Sdt,TinhTrang) values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, h.getMa());
            ps.setString(2, h.getDiaChi());
            ps.setString(3, h.getSDT());
            ps.setInt(4, 0);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean update(String id) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "update HoaDon set TinhTrang = 1 where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
        }
        return false;
    }
}
