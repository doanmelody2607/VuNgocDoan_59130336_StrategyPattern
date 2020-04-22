/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import java.util.ArrayList;

/**
 *
 * @author Vu Ngoc Doan
 */
public class GioHang 
{
    //Hinh thuc thanh toan
    IThanhToan hinhThucTT;
    
    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    //Danh sach hang hoa
    ArrayList<HangHoa> dsHH = new ArrayList<>();
    
    public void themHangHoa(HangHoa hh)
    {
        dsHH.add(hh);
    }
    
    public void XuatGioHang()
    {
        int tienThanhToan = 0;
        for(HangHoa i : dsHH)
        {
            tienThanhToan = tienThanhToan + i.getGia();
        }
        System.out.println("Total: " + hinhThucTT.thanhToan(tienThanhToan));
        System.out.println("------------------------------------");
    }
}
