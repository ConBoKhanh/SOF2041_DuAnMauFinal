/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainModel.HoaDonChiTiet;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilities.DBContext;
import viewModel.HoaDonChiTietViewModel;

/**
 *
 * @author ktkha
 */
public class HoaDonChiTietRepo {

    public List<HoaDonChiTiet> getHDCT() throws SQLException {
        List<HoaDonChiTiet> list = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = "  SELECT HoaDon.Id,ChiTietSP.IdSP,HoaDon.Ma AS 'MA HD',SanPham.Ma AS 'Ma SP',SanPham.Ten,HoaDonChiTiet.SoLuong,HoaDonChiTiet.DonGia FROM HoaDon\n"
                + "  JOIN HoaDonChiTiet ON HoaDon.Id = HoaDonChiTiet.IdHoaDon\n"
                + "  JOIN ChiTietSP ON HoaDonChiTiet.IdChiTietSP = ChiTietSP.ID\n"
                + "  JOIN SanPham ON ChiTietSP.IdSP = SanPham.Id";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            list.add(new HoaDonChiTiet(
                    rs.getString("Id"),
                    rs.getString("IdSP"),
                    rs.getString("Ma HD"),
                    rs.getString("Ma SP"),
                    rs.getString("Ten"),
                    rs.getInt("SoLuong"),
                    rs.getBigDecimal("DonGia")));
        }
        return list;
    }

    public void add(HoaDonChiTiet HDCT) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "Insert into HoaDonChiTiet Values (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, HDCT.getIdHoaDon());
        ps.setString(2, HDCT.getIdChiTietSP());
        ps.setInt(3, HDCT.getSoLuong());
        ps.setBigDecimal(4, HDCT.getDonGia());
        ps.executeUpdate();
    }

    public void delete(String IdHoaDon, String idCTSP) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "DELETE FROM HoaDonChiTiet WHERE IdHoaDon = ? AND IdChiTietSP = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, IdHoaDon);
        ps.setString(2, idCTSP);
        ps.executeUpdate();

    }

    public List<HoaDonChiTietViewModel> getGioHang(String Id) throws SQLException {
        List<HoaDonChiTietViewModel> list = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = " SELECT HoaDon.Id,SanPham.Ma,SanPham.Ten,HoaDonChiTiet.SoLuong,ChiTietSP.GiaBan,HoaDonChiTiet.DonGia FROM HoaDon\n"
                + "  JOIN HoaDonChiTiet ON HoaDon.Id = HoaDonChiTiet.IdHoaDon\n"
                + "  JOIN ChiTietSP ON HoaDonChiTiet.IdChiTietSP = ChiTietSP.ID\n"
                + "  JOIN SanPham ON ChiTietSP.IdSP = SanPham.Id WHERE HoaDonChiTiet.IdHoaDon = ? ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            list.add(new HoaDonChiTietViewModel(
                    rs.getString("Id"),
                    rs.getString("Ma"),
                    rs.getString("Ten"),
                    rs.getInt("SoLuong"),
                    rs.getBigDecimal("GiaBan"),
                    rs.getBigDecimal("DonGia")));
        }
        return list;
    }

    public int getTongTien(String id) throws SQLException {
        int max = 0;
        Connection conn = DBContext.getConnection();
        String sql = "SELECT Sum(DonGia) as 'TongTien' FROM HoaDonChiTiet where idHoaDon = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            max = rs.getInt("TongTien");
        }
        return max;
    }

    public static void main(String[] args) throws SQLException {
        HoaDonChiTietRepo hdRepo = new HoaDonChiTietRepo();
        HoaDonChiTiet a = new HoaDonChiTiet();
        a.setIdChiTietSP("0B58AA60-7F3F-4769-BC50-927353E4B2EB");
        a.setIdHoaDon("B773B6DD-3791-4B10-9CA7-F90A90E7E153");
        a.setSoLuong(1);
        a.setDonGia(new BigDecimal(13000));
        hdRepo.add(a);
    }
}
