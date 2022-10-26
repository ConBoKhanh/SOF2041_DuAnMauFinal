/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainModel.CuaHang;
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
public class CuaHangRepo {

    public List<CuaHang> getList() throws SQLException {
        List<CuaHang> ch = new ArrayList<>();
        Connection conn = DBContext.getConnection();
        String sql = "SELECT Id,Ma,Ten,DiaChi,ThanhPho, QuocGia FROM CuaHang";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            ch.add(new CuaHang(
                    rs.getString("Id"),
                    rs.getString("Ma"),
                    rs.getString("Ten"),
                    rs.getString("DiaChi"),
                    rs.getString("ThanhPho"),
                    rs.getString("QuocGia")));
        }
        return ch;
    }

    public void add(CuaHang ch) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "INSERT INTO CuaHang (Ma,Ten,DiaChi,ThanhPho, QuocGia) Values (?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, ch.getMa());
        ps.setString(2, ch.getTen());
        ps.setString(3, ch.getDiaChi());
        ps.setString(4, ch.getThanhPho());
        ps.setString(5, ch.getQuocGia());
        ps.executeUpdate();
    }

    public void update(CuaHang ch, String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "UPDATE CuaHang SET Ma = ?, Ten = ?, DiaChi = ?, ThanhPho = ?,QuocGia =? WHERE Id = ? ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, ch.getMa());
        ps.setString(2, ch.getTen());
        ps.setString(3, ch.getDiaChi());
        ps.setString(4, ch.getThanhPho());
        ps.setString(5, ch.getQuocGia());
        ps.setString(6, Id);
        ps.executeUpdate();
    }

    public void delete(String Id) throws SQLException {
        Connection conn = DBContext.getConnection();
        String sql = "DELETE FROM CuaHang WHERE Id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Id);
        ps.executeUpdate();
    }

}
