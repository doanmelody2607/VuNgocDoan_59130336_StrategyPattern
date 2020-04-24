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
public class Chia implements ITinhToan
{

    @Override
    public float tinh(float a, float b) 
    {
        if(b==0){
            System.out.println("Không chọ");
            return 0;
        }
        else
        return a / b;
    }
    
}
