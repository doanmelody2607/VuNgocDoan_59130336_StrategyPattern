/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Vu Ngoc Doan
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GioHang gh = new GioHang();
        //Thong tin hang hoa        
        HangHoa samsung = new HangHoa("Samsung Galaxy S20", 9000000, "Thiết kế gọn nhẹ, màn hình sắc nét, camera góc rộng...");
        System.out.println(samsung.XuatThongTinHH());
        gh.themHangHoa(samsung);
        
        //Thanh toan Online
        System.out.println("Phương thức thanh toán Online:");
        gh.setHinhThucTT(new ThanhToanOnline());
        gh.XuatGioHang();
        
        //Thanh toan COD
        System.out.println("Phương thức thanh toán COD:");
        gh.setHinhThucTT(new ThanhToanCOD());
        gh.XuatGioHang();
        
    }
    
}
