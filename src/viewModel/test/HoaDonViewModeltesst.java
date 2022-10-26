/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel.test;

/**
 *
 * @author Admin
 */
public class HoaDonViewModeltesst {

    private String Id;
    private String Ma;
    private String DiaChi;
    private String sdt;
    private String TinhTrang;

    public HoaDonViewModeltesst(String Id, String Ma, String DiaChi, String sdt, String TinhTrang) {
        this.Id = Id;
        this.Ma = Ma;
        this.DiaChi = DiaChi;
        this.sdt = sdt;
        this.TinhTrang = TinhTrang;
    }

    public HoaDonViewModeltesst() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    @Override
    public String toString() {
        return "HoaDonViewModel{" + "Id=" + Id + ", Ma=" + Ma + ", DiaChi=" + DiaChi + ", sdt=" + sdt + ", TinhTrang=" + TinhTrang + '}';
    }

}
