/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainModel;

/**
 *
 * @author ktkha
 */
public class SanPham {
    private String id;
    private String maSP;
    private String tenSP;

    public SanPham() {
    }

    public SanPham(String id, String maSP, String tenSP) {
        this.id = id;
        this.maSP = maSP;
        this.tenSP = tenSP;
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

    @Override
    public String toString() {
        return "SanPham{" + "id=" + id + ", maSP=" + maSP + ", tenSP=" + tenSP + '}';
    }
    
    
    
}
