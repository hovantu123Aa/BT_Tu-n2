/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad04.bt3;

/**
 *
 * @author ADMIN
 */
public class SinhVienIT extends SinhVien{
    public double diemjava;
    public double diemcss;
    public double diemHTML;

    public SinhVienIT(String hoten, double diemjava, double diemcss, double diemHTML) {
        super(hoten,"IT");
        this.diemjava = diemjava;
        this.diemcss = diemcss;
        this.diemHTML = diemHTML;
    }

    @Override
    public Double getDiem() {
        return (diemjava*2+diemHTML+diemcss)/4;
    }
    
}
