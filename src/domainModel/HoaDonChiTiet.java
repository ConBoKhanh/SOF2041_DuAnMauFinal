/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainModel;

import java.math.BigDecimal;

/**
 *
 * @author ktkha
 */
public class HoaDonChiTiet {

    private String idHoaDon;
    private String idChiTietSP;
    private String maHoaDon;
    private String maSanPham;
    private String tenSp;
    private Integer soLuong;
    private BigDecimal donGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String idHoaDon, String idChiTietSP, String maHoaDon, String maSanPham, String tenSp, Integer soLuong, BigDecimal donGia) {
        this.idHoaDon = idHoaDon;
        this.idChiTietSP = idChiTietSP;
        this.maHoaDon = maHoaDon;
        this.maSanPham = maSanPham;
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(String idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "idHoaDon=" + idHoaDon + ", idChiTietSP=" + idChiTietSP + ", maHoaDon=" + maHoaDon + ", maSanPham=" + maSanPham + ", tenSp=" + tenSp + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

}
