/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.util.ArrayList;
/**
 *
 * @author Vu Ngoc Doan
 */
public class QLSV 
{
    //Hinh thuc so sanh
    ISoSanh<SinhVien> soSanh;

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }
    
    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    //Danh sach cac doi tuong sinh vien
    ArrayList<SinhVien> dsSV = new ArrayList<>();
    
    public void themSinhVien(SinhVien sv)
    {
        dsSV.add(sv);
    }

    public ArrayList<SinhVien> getDsSV() {
        return dsSV;
    }

    public void setDsSV(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }
    
    public void sapXep()
    {

    }
    
    public void inDS()
    {
        
    }
}
