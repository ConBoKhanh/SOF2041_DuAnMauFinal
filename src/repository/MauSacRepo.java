/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainModel.MauSac;
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
public class MauSacRepo {
    
    public List<MauSac> getList() throws SQLException{
        List<MauSac> list = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = "SELECT Id,Ma,Ten FROM MauSac";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {            
            list.add(new MauSac(rs.getString("Id"),
                    rs.getString("Ma"),
                    rs.getString("Ten")));
        }
        return list;
    }
    
    public void add(MauSac ms) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "INSERT INTO MauSac (Ma,Ten) Values (?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, ms.getMa());
        ps.setString(2, ms.getTen());
        ps.executeUpdate();
    }
    
       public void update(MauSac ms, String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "UPDATE MauSac set Ma = ?, Ten = ? Where Id =?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, ms.getMa());
        ps.setString(2, ms.getTen());
        ps.setString(3, Id);
        ps.executeUpdate();
    }
        
        public void delete(String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "DELETE  MauSac WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Id);
        ps.executeUpdate();
    }
}
