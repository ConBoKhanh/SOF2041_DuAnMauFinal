/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel;

import java.math.BigDecimal;

/**
 *
 * @author ktkha
 */
public class HoaDonChiTietViewModel {
    private String Id;
    private String maSP;
    private String tenSP;
    private int soLuong;
    private BigDecimal dongia;
    private BigDecimal thanhTien;

    public HoaDonChiTietViewModel() {
    }

    public HoaDonChiTietViewModel(String Id, String maSP, String tenSP, int soLuong, BigDecimal dongia, BigDecimal thanhTien) {
        this.Id = Id;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.dongia = dongia;
        this.thanhTien = thanhTien;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDongia() {
        return dongia;
    }

    public void setDongia(BigDecimal dongia) {
        this.dongia = dongia;
    }

    public BigDecimal getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(BigDecimal thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return "HoaDonChiTietViewModel{" + "Id=" + Id + ", maSP=" + maSP + ", tenSP=" + tenSP + ", soLuong=" + soLuong + ", dongia=" + dongia + ", thanhTien=" + thanhTien + '}';
    }
    
    
}
