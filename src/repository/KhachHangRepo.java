/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainModel.KhachHang;
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
public class KhachHangRepo {

    public List<KhachHang> getList() throws SQLException {
        List<KhachHang> kh = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = "SELECT Id,Ma,Ten,TenDem,Ho,NgaySinh,SDT,DiaChi,ThanhPho,QuocGia,MatKhau FROM KhachHang";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            kh.add(new KhachHang(
                    rs.getString("Id"),
                    rs.getString("Ma"),
                    rs.getString("Ten"),
                    rs.getString("TenDem"),
                    rs.getString("Ho"),
                    rs.getString("NgaySinh"),
                    rs.getString("SDT"),
                    rs.getString("DiaChi"),
                    rs.getString("ThanhPho"),
                    rs.getString("QuocGia"),
                    rs.getString("MatKhau")));
        }
        return kh;
    }

    public void add(KhachHang kh) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "  INSERT INTO KhachHang (Ma,Ten,TenDem,Ho,NgaySinh,SDT,DiaChi,ThanhPho,QuocGia,MatKhau) Values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, kh.getMa());
        ps.setString(2, kh.getTen());
        ps.setString(3, kh.getTenDem());
        ps.setString(4, kh.getHo());
        ps.setString(5, kh.getNgaySinh());
        ps.setString(6, kh.getSDT());
        ps.setString(7, kh.getDiaChi());
        ps.setString(8, kh.getThanhPho());
        ps.setString(9, kh.getQuocGia());
        ps.setString(10, kh.getMatKhau());
        ps.executeUpdate();
    }

    public void update(KhachHang kh, String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "  UPDATE KhachHang SET Ma = ?,Ten = ?,TenDem = ?,Ho = ?,NgaySinh = ?,SDT = ?,DiaChi = ?,ThanhPho = ?,QuocGia = ?,MatKhau = ? WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, kh.getMa());
        ps.setString(2, kh.getTen());
        ps.setString(3, kh.getTenDem());
        ps.setString(4, kh.getHo());
        ps.setString(5, kh.getNgaySinh());
        ps.setString(6, kh.getSDT());
        ps.setString(7, kh.getDiaChi());
        ps.setString(8, kh.getThanhPho());
        ps.setString(9, kh.getQuocGia());
        ps.setString(10, kh.getMatKhau());
        ps.setString(11, Id);
        ps.executeUpdate();
    }

    public void delete(String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "  DELETE FROM KhachHang WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Id);
        ps.executeUpdate();
    }

}
