/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domainModel.ChucVu;
import java.util.List;

/**
 *
 * @author ktkha
 */
public interface ChucVuService {

    List<ChucVu> getList();

    public void add(ChucVu cv);

    public void update(ChucVu cv, String Id);

    public void delete(String Id);

}
