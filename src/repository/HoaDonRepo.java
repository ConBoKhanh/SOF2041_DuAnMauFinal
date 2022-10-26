/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainModel.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utilities.DBContext;
import viewModel.HoaDonViewModel;

/**
 *
 * @author ktkha
 */
public class HoaDonRepo {

    public List<HoaDon> getList() throws SQLException {
        List<HoaDon> hoaDons = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = "  select Id,Ma,NgayTao,NgayThanhToan,NgayShip,NgayNhan,TinhTrang,TenNguoiNhan,DiaChi,SDT\n"
                + "  from HoaDon \n";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            hoaDons.add(new HoaDon(
                    rs.getString("Id"),
                    rs.getString("Ma"),
                    rs.getString("NgayTao"),
                    rs.getString("NgayThanhToan"),
                    rs.getString("NgayShip"),
                    rs.getString("NgayNhan"),
                    rs.getInt("TinhTrang"),
                    rs.getString("TenNguoiNhan"),
                    rs.getString("DiaChi"),
                    rs.getString("SDT")));
        }
        return hoaDons;
    }


    public void add(HoaDon h) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "INSERT INTO HoaDon (Ma,NgayTao,NgayThanhToan,NgayShip,NgayNhan,TinhTrang,TenNguoiNhan,DiaChi,SDT) Values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, h.getMa());
        ps.setString(2, h.getNgayTao());
        ps.setString(3, h.getNgayThanhToan());
        ps.setString(4, h.getNgayShip());
        ps.setString(5, h.getNgayNhan());
        ps.setInt(6, h.getTinhTrang());
        ps.setString(7, h.getTenNguoiNhan());
        ps.setString(8, h.getDiaChi());
        ps.setString(9, h.getSDT());
        ps.executeUpdate();
    }

    public void update(HoaDon h, String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "UPDATE HoaDon SET Ma = ?,NgayTao = ?,NgayThanhToan = ?,NgayShip = ?,NgayNhan = ?,TinhTrang = ?,TenNguoiNhan = ?,DiaChi = ?,SDT = ? WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, h.getMa());
        ps.setString(2, h.getNgayTao());
        ps.setString(3, h.getNgayThanhToan());
        ps.setString(4, h.getNgayShip());
        ps.setString(5, h.getNgayNhan());
        ps.setInt(6, h.getTinhTrang());
        ps.setString(7, h.getTenNguoiNhan());
        ps.setString(9, h.getSDT());
        ps.setString(10, Id);
        ps.executeUpdate();
    }
    
    public void updateThanhToan(String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "UPDATE HoaDon Set TinhTrang = ?  WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, 1);
        ps.setString(2, Id);
        ps.executeUpdate();
    }

    public void delete(String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "DELETE FROM Hoadon WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Id);
        ps.executeUpdate();

    }

    public List<HoaDonViewModel> getListHDBH() throws SQLException {
        List<HoaDonViewModel> hoaDons = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = "SELECT  HoaDon.Id,HoaDon.Ma,HoaDon.NgayTao,NhanVien.Ten,HoaDon.TinhTrang  "
                + "FROM HoaDon JOIN NhanVien ON HoaDon.IdNV = NhanVien.Id";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            hoaDons.add(new HoaDonViewModel(
                    rs.getString("Id"),
                    rs.getString("Ma"),
                    rs.getString("NgayTao"),
                    rs.getString("Ten"),
                    rs.getInt("TinhTrang")));
        }
        return hoaDons;
    }
    public List<HoaDonViewModel> getListtt(int i) throws SQLException {
        List<HoaDonViewModel> hoaDons = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = "SELECT  HoaDon.Id,HoaDon.Ma,HoaDon.NgayTao,NhanVien.Ten,HoaDon.TinhTrang  "
                + "FROM HoaDon JOIN NhanVien ON HoaDon.IdNV = NhanVien.Id where TinhTrang = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, i);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            hoaDons.add(new HoaDonViewModel(
                    rs.getString("Id"),
                    rs.getString("Ma"),
                    rs.getString("NgayTao"),
                    rs.getString("Ten"),
                    rs.getInt("TinhTrang")));
        }
        return hoaDons;
    }

    public void addHoaDon(String date) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "INSERT INTO HoaDon (Ma,idNV,NgayTao,TinhTrang) Values (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.valueOf(getMaxMa()));
        ps.setString(2, "A55CF1EA-C1E4-4D91-A5A7-C30DA18462E4");
        ps.setString(3, date);
        ps.setInt(4, 0);
        ps.executeUpdate();
    }

    public int getMaxMa() throws SQLException {
        int max = 0;
        Connection conn = DBContext.getConnection();
        String sql = "SELECT MAX(Ma) as 'MaxMa' FROM HoaDon";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            max = rs.getInt("MaxMa");
        }
        return max + 1;
    }
  

    public static void main(String[] args) throws SQLException {
        HoaDonRepo hdRepo = new HoaDonRepo();
//        int ma = hdRepo.getMaxMa();
//        System.out.println(ma);
            hdRepo.addHoaDon("2003-10-10");
    }

}
