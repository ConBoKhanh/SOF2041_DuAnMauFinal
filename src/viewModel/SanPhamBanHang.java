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
public class SanPhamBanHang {
    private String id;
    private String maSP;
    private String tenSP;
    private int namBH;
    private String moTa;
    private int soLuong;
    private BigDecimal giaNhap;
    private BigDecimal giaBan;

    public SanPhamBanHang() {
    }

    public SanPhamBanHang(String id, String maSP, String tenSP, int namBH, String moTa, int soLuong, BigDecimal giaNhap, BigDecimal giaBan) {
        this.id = id;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "SanPhamBanHang{" + "id=" + id + ", maSP=" + maSP + ", tenSP=" + tenSP + ", namBH=" + namBH + ", moTa=" + moTa + ", soLuong=" + soLuong + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }
    
    
    
}
