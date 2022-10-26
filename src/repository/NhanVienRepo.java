/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainModel.MauSac;
import domainModel.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utilities.DBContext;

/**
 *
 * @author ktkha
 */
public class NhanVienRepo {
    
    
    public List<NhanVien> getList() throws SQLException{
        List<NhanVien> nv = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = "select Id,Ma,Ten,TenDem,Ho,GioiTinh,NgaySinh,DiaChi,Sdt,MatKhau,TrangThai from  NhanVien";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {            
            nv.add(new NhanVien(
                    rs.getString("Id"),
                    rs.getString("Ma"),
                    rs.getString("Ten"),
                    rs.getString("TenDem"),
                    rs.getString("Ho"),
                    rs.getString("GioiTinh"),
                    rs.getString("NgaySinh"),
                    rs.getString("DiaChi"),
                    rs.getString("Sdt"),
                    rs.getString("MatKhau"),
                    rs.getInt("TrangThai")));
        }
        return nv;
    }
    
    public void add(NhanVien nv) throws SQLException{
        Connection conn = DBContext.getConnection();
        String sql = "  INSERT INTO NhanVien (Ma,Ten,TenDem,Ho,GioiTinh,NgaySinh,DiaChi,Sdt,MatKhau,TrangThai) Values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nv.getMa());
        ps.setString(2, nv.getTen());
        ps.setString(3, nv.getTenDem());
        ps.setString(4, nv.getHo());
        ps.setString(5, nv.getGioiTinh());
        ps.setString(6, nv.getNgaySinh());
        ps.setString(7, nv.getDiaChi());
        ps.setString(8, nv.getSDT());
        ps.setString(9, nv.getMatKhau());
        ps.setInt(10, nv.getTrangThai());
        ps.executeUpdate();
    }
    
    public void update(NhanVien nv, String Id) throws SQLException{
        Connection conn = DBContext.getConnection();
        String sql = "  UPDATE NhanVien Set Ma = ?, Ten = ?,TenDem = ?,Ho = ?,GioiTinh = ?,NgaySinh = ?,DiaChi = ?,Sdt = ?,MatKhau = ?,TrangThai = ? Where Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nv.getMa());
        ps.setString(2, nv.getTen());
        ps.setString(3, nv.getTenDem());
        ps.setString(4, nv.getHo());
        ps.setString(5, nv.getGioiTinh());
        ps.setString(6, nv.getNgaySinh());
        ps.setString(7, nv.getDiaChi());
        ps.setString(8, nv.getSDT());
        ps.setString(9, nv.getMatKhau());
        ps.setInt(10, nv.getTrangThai());
        ps.setString(11, Id);
        ps.executeUpdate();
    }
    
    public void delete(String Id) throws SQLException{
         Connection conn = DBContext.getConnection();
        String sql = "DELETE FROM NhanVien WHERE ID = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Id);
        ps.executeUpdate();
    }
}
