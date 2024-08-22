/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad02.bt1;

/**
 *
 * @author ADMIN
 */
public class HinhVuong extends HinhChuNhat{

    public HinhVuong(double canh) {
        super(canh,canh);
    }

    @Override
    public void Xuat() {
        System.out.println("HV_Canh" +super.dai + " Chu vi"+super.getChuVi()+"Dien tich " +super.getDienTich());
    }
    
   
}
