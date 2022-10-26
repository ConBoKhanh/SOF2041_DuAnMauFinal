/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainModel.SanPham;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import utilities.DBContext;

/**
 *
 * @author ktkha
 */
public class SanPhamRepository {

    public List<SanPham> getList() throws SQLException {
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
    
    public void add(SanPham sp) throws SQLException{
        Connection conn = DBContext.getConnection();
        String sql = "INSERT INTO SanPham (Ma,Ten) Values (?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, sp.getMaSP());
        ps.setString(2, sp.getTenSP());
        ps.executeUpdate();
    }
    
    public void update(SanPham sp, String Id) throws SQLException{
        Connection conn = DBContext.getConnection();
        String sql = "UPDATE SanPham set Ma = ?, Ten = ? Where Id =?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, sp.getMaSP());
        ps.setString(2, sp.getTenSP());
        ps.setString(3,Id);
        ps.executeUpdate();
    }
    
    
    
    public void delete(String Id) throws SQLException{
        Connection conn = DBContext.getConnection();
        String sql = "DELETE  SanPham WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Id);
        ps.executeUpdate();
    }

}
