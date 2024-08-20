/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.BT1;

import java.util.Scanner;
public class trươngTrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1, r2;
        System.out.print("Tao r1");
        r1 = new Rectangle();
        System.out.print("Tao t2");
        System.out.print("chieu dai la: ");
        double dai = sc.nextDouble();
        System.out.print("Chieu rong la: ");
        double rong = sc.nextDouble();
        r2 = new Rectangle(dai,rong);
        System.out.println("Thong tin ket qua ");
        System.out.println("HCN r1: dai:" + r1.getLenght() + " -rong: " + r1.getWidth() + "chu vi" +r1.tinhchuvi()  + "dien tich" + r1.tinhdientich());
        System.out.println("HCN r2: dai:" + r2.getLenght() + " -rong: " + r2.getWidth() + "-dientich" + r2.tinhdientich() + "-chuvi" + r2.tinhchuvi());
        System.err.println("kq:");
    }
}
