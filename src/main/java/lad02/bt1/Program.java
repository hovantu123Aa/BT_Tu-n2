/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad02.bt1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("cho biet thong tin hinh chu nhat");
        System.out.println("chieu dai:");
        double dai=sc.nextDouble();
        System.out.println("chieu rong:");
        double rong=sc.nextDouble();
        HinhChuNhat hcn=new HinhChuNhat(dai,rong);
        System.out.println("ket qua:");
        hcn.Xuat();
        System.out.println("cho biet thong tin hinh vuong");
        System.out.println("canh:");
        double canh=sc.nextDouble();
        HinhVuong hv=new HinhVuong(canh);
        System.out.println("ket qua:");
        hv.Xuat();
    }
}
