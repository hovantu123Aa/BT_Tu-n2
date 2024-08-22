/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad02.bt1;

/**
 *
 * @author ADMIN
 */
public class HinhChuNhat {

    public double dai;
    public double rong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public Double getDai() {
        return dai;
    }

    public void setDai(Double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void Xuat() {
        System.out.println("HCN_Chieu dai" + dai + "chieu rong" + rong + " Chu vi" + getChuVi() + "Dien tich " + getDienTich());
    }
}
