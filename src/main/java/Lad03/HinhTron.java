/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lad03;

/**
 *
 * @author ADMIN
 */
public class HinhTron {
    private  double bankinh;

    public HinhTron(double bankinh) {
        this.bankinh = bankinh;
    }

    public HinhTron() {
        this(1.0);
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
    public double TinhDienTich(){
        return Math.PI*bankinh*bankinh;
    }
    public double TinhChuVi(){
        return Math.PI*2*bankinh;
    }
    public void xuat(){
        System.out.println("Hinh tron:"+ bankinh+"dien tich "+TinhDienTich()+"chu vi"+TinhChuVi());
    }
}
