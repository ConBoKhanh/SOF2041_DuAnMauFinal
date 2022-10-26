/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import viewModel.SanPhamBanHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilities.DBContext;

/**
 *
 * @author ktkha
 */
public class SanPhamBanHangRepo {

    public static void main(String[] args) throws SQLException {
        SanPhamBanHangRepo bhRepo = new SanPhamBanHangRepo();
        List<SanPhamBanHang> sanPhamBanHangs = bhRepo.getListSP();

        for (SanPhamBanHang sanPhamBanHang : sanPhamBanHangs) {
            System.out.println(sanPhamBanHang.toString());
        }

    }

    public List<SanPhamBanHang> getListSP() throws SQLException {
        List<SanPhamBanHang> sanPhamBanHangs = new ArrayList<>();
        sanPhamBanHangs = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = """
                       SELECT ChiTietSP.Id,SanPham.Ma,SanPham.Ten,ChiTietSP.NamBH,ChiTietSP.MoTa,
                       ChiTietSP.SoLuongTon,ChiTietSP.GiaNhap,ChiTietSP.GiaBan 
                       FROM SanPham JOIN ChiTietSP ON SanPham.Id = ChiTietSP.IdSP""";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            sanPhamBanHangs.add(new SanPhamBanHang(
                    rs.getString("Id"),
                    rs.getString("Ma"),
                    rs.getString("Ten"),
                    rs.getInt("NamBH"),
                    rs.getString("MoTa"),
                    rs.getInt("SoLuongTon"),
                    rs.getBigDecimal("GiaNhap"),
                    rs.getBigDecimal("GiaBan")));
        }

        return sanPhamBanHangs;
    }

    public boolean update(String Id, int soLuong) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "UPDATE ChiTietSP SET SoLuongTon = ? WHERE Id = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, soLuong);
            ps.setString(2, Id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
