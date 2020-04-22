/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Vu Ngoc Doan
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Context context = new Context();
        //Thuc hien phep cong
        context.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + context.tinh(75, 12));
        //Thuc hien phep tru
        context.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + context.tinh(54, 78));
    }
    
}
