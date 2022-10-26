/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel;

/**
 *
 * @author ktkha
 */
public class HoaDonViewModel {
    private String id;
    private String ma;
    private String ngayTao;
    private String tenNV;
    private int trangThai;

    public HoaDonViewModel() {
    }

    public HoaDonViewModel(String id, String ma, String ngayTao, String tenNV, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.tenNV = tenNV;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", ma=" + ma + ", ngayTao=" + ngayTao + ", tenNV=" + tenNV + ", trangThai=" + trangThai + '}';
    }
    
    
    
}
