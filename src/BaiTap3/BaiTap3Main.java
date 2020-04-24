/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 *
 * @author Vu Ngoc Doan
 */


public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException
    {
        // TODO code application logic here
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SinhVien sv1 = new SinhVien("Vũ Ngọc Đoàn", sdf.parse("26/07/1999"), 8);
        SinhVien sv2 = new SinhVien("Lê Văn Tèo", sdf.parse("20/05/1999"), 6);
        SinhVien sv3 = new SinhVien("Nguyễn Văn Ngốc", sdf.parse("21/08/1999"), 7);
        SinhVien sv4 = new SinhVien("Hà Văn Lâm", sdf.parse("05/02/1998"), 10);
        
        QLSV ql = new QLSV();
        ql.themSinhVien(sv1);
        ql.themSinhVien(sv2);
        ql.themSinhVien(sv3);
        ql.themSinhVien(sv4);
        
        //In ra danh sách các sinh viên được thêm vào
        System.out.println("Danh sách các sinh viên được thêm vào:");
        ql.inDS();
        
        //So sánh theo tên
        System.out.println("Sắp xếp theo tên:");
        ql.setSoSanh(new SoSanhTheoTen());
        ql.sapXep();
        ql.inDS();
        
        //So sánh theo điểm
        System.out.println("Sắp xếp theo điểm:");
        ql.setSoSanh(new SoSanhTheoDiem());
        ql.sapXep();
        ql.inDS();
    }
    
}
