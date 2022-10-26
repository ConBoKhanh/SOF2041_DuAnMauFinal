/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainModel.ChucVu;
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
public class ChucVuRepo {

    public List<ChucVu> getList() throws SQLException {
        List<ChucVu> chucVus = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = "SELECT Id,Ma,Ten FROM ChucVu";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            chucVus.add(new ChucVu(
                    rs.getString("Id"),
                    rs.getString("Ma"),
                    rs.getString("Ten")));
        }
        return chucVus;
    }

    public void add(ChucVu cv) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "INSERT INTO ChucVu (Ma,Ten) Values (?,?) ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, cv.getMa());
        ps.setString(2, cv.getTen());
        ps.executeUpdate();
    }

    public void update(ChucVu cv, String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "UPDATE ChucVu SET Ma = ?, Ten = ? WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, cv.getMa());
        ps.setString(2, cv.getTen());
        ps.setString(3, Id);
        ps.executeUpdate();
    }

    public void delete(String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "DELETE FROM ChucVu Where Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Id);
        ps.executeUpdate();
    }

}
