/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Vu Ngoc Doan
 */
public class QLSV 
{
    //Hinh thuc so sanh
    ISoSanh<SinhVien> soSanh;

    public QLSV() {
    }
    
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
    
    public void sapXep()
    {
        for(int i =0; i < dsSV.size() - 1 ;i++)
        {
            for(int j = i+1; j<dsSV.size(); j++)
            {
                if(soSanh.soSanh(dsSV.get(i), dsSV.get(j)) > 0)
                {    
                    Collections.swap(dsSV, i, j);
                }    
            }
        }
    }
    
    public void inDS()
    {
        for(int i=0; i<dsSV.size(); i++)
        {
            System.out.println(dsSV.get(i).getThongTin());
        }    
        System.out.println("-----------------------------------------------------");
    }
}
