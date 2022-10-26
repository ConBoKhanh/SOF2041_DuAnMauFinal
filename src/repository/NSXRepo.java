/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainModel.NSX;
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
public class NSXRepo {

    public List<NSX> getList() throws SQLException {
        List<NSX> nsxs = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = "SELECT Id,Ma,Ten FROM NSX";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            nsxs.add(new NSX(
                    rs.getString("Id"),
                    rs.getString("Ma"),
                    rs.getString("Ten")));
        }
        return nsxs;
    }

    public void add(NSX nsx) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "INSERT INTO NSX (Ma,Ten) Values (?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nsx.getMa());
        ps.setString(2, nsx.getTen());
        ps.executeUpdate();
    }

    public void update(NSX nsx, String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "UPDATE NSX set Ma = ?, Ten = ? Where Id =?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nsx.getMa());
        ps.setString(2, nsx.getTen());
        ps.setString(3, Id);
        ps.executeUpdate();
    }

    public void delete(String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "DELETE  NSX WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Id);
        ps.executeUpdate();
    }

}
