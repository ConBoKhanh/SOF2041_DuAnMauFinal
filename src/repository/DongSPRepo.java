/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainModel.DongSP;
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
public class DongSPRepo {
    public List<DongSP> getList() throws SQLException{
        List<DongSP> dongSPs = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = "SELECT Id,Ma,Ten FROM DongSP";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            dongSPs.add(new DongSP(
                    rs.getString("Id"),
                    rs.getString("Ma"),
                    rs.getString("Ten")));
        }
        return dongSPs;
    }
    
    public void add(DongSP dongSP) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "INSERT INTO DongSP (Ma,Ten) Values (?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, dongSP.getMa());
        ps.setString(2, dongSP.getTen());
        ps.executeUpdate();
    }
    
    public void update(DongSP dongSP, String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "UPDATE DongSP set Ma = ?, Ten = ? Where Id =?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, dongSP.getMa());
        ps.setString(2, dongSP.getTen());
        ps.setString(3, Id);
        ps.executeUpdate();
    }

        public void delete(String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "DELETE  DongSP WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Id);
        ps.executeUpdate();
    }
}
