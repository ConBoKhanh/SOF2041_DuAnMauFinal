/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel.test;

/**
 *
 * @author Admin
 */
public class cuaHangViewModel {

    private String id;
    private String ma;
    private String ten;
    private String diachi;
    private String thanhpho;
    private String quocgia;

    public cuaHangViewModel() {
    }

    public cuaHangViewModel(String id, String ma, String ten, String diachi, String thanhpho, String quocgia) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.diachi = diachi;
        this.thanhpho = thanhpho;
        this.quocgia = quocgia;
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

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    @Override
    public String toString() {
        return "cuaHangViewModel{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", diachi=" + diachi + ", thanhpho=" + thanhpho + ", quocgia=" + quocgia + '}';
    }

}
