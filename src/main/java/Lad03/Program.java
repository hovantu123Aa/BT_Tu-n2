/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lad03;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cho biet thong tin hinh tron");
        System.out.println("cho biet ban kinh:");
        double bk = sc.nextDouble();
        HinhTron HTron = new HinhTron(bk);
        System.out.println("ket qua:");
        HTron.xuat();
        System.out.println("cho biet thong tin hinh tru");
        System.out.println("cho biet chieu cao:");
        double CCao = sc.nextDouble();
        HinhTru hT=new HinhTru(CCao);
        System.out.println("ket qua:");
        hT.xuat();
        
    }
}
