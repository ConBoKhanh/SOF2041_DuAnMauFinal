/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainModel.ChiTietSP;
import domainModel.SanPham;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilities.DBContext;

/**
 *
 * @author ktkha
 */
public class ChiTietSPRepo {

    public List<ChiTietSP> getCTSP() throws SQLException {
        List<ChiTietSP> chiTietSPs = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = "SELECT ChiTietSP.Id,SanPham.Ten,"
                + " ChiTietSP.NamBH, ChiTietSP.MoTa,ChiTietSP.SoLuongTon,ChiTietSP.GiaNhap,ChiTietSP.GiaBan"
                + "  FROM\n"
                + "  ChiTietSP JOIN SanPham ON ChiTietSP.IdSP = SanPham.Id";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            chiTietSPs.add( new ChiTietSP(
                    rs.getString("Id"),
                    rs.getString("Ten"),
                    rs.getInt("NamBH"),
                    rs.getString("MoTa"),
                    rs.getInt("SoLuongTon"),
                    rs.getBigDecimal("GiaNhap"),
                    rs.getBigDecimal("GiaBan")));
        }

        return chiTietSPs;
    }

    public void add(ChiTietSP ctsp) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "INSERT INTO ChiTietSP (NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan,IdSP) Values (?,?,?,?,?,?) ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, ctsp.getNamBH());
        ps.setString(2, ctsp.getMoTa());
        ps.setInt(3, ctsp.getSoLuongTon());
        ps.setBigDecimal(4, ctsp.getGiaNhap());
        ps.setBigDecimal(5, ctsp.getGiaBan());
        ps.setString(6, ctsp.getIdSP());
        ps.executeUpdate();

    }

    public void update(ChiTietSP ctsp, String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "  UPDATE ChiTietSP SET NamBH = ?, MoTa = ?, SoLuongTon = ?, GiaNhap = ?, GiaBan = ? \n"
                + "  WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, ctsp.getNamBH());
        ps.setString(2, ctsp.getMoTa());
        ps.setInt(3, ctsp.getSoLuongTon());
        ps.setBigDecimal(4, ctsp.getGiaNhap());
        ps.setBigDecimal(5, ctsp.getGiaBan());
        ps.setString(6, Id);
        ps.executeUpdate();

    }
    
    
    public void delete(String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "DELETE ChiTietSP WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Id);
        ps.executeUpdate();

    }
    
    public List<SanPham> getListSP() throws SQLException {
        List<SanPham> sanPhams = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = "  SELECT Id,Ma,Ten FROM SanPham";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            sanPhams.add(new SanPham(
                    rs.getString("Id"),
                    rs.getString("Ma"),
                    rs.getString("Ten")));
        }
        return sanPhams;
    }

}
