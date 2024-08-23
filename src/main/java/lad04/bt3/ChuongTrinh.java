/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad04.bt3;
;

import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {
    static ArrayList<SinhVien> DS =new ArrayList<SinhVien>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int chon = 5;
        Scanner SR = new Scanner(System.in);
        do {
            System.out.println(" CHUONG TRINH QUAN LY SINH VIEN:");
            System.out.println(" 1.Nhap danh sach sinh vien:");
            System.out.println(" 2.Xuat thong tin danh sach sinh vien:");
            System.out.println(" 3.Xuât danh sach sinh vien co hoc luc gioi:");
            System.out.println(" 4.Sap xep danh sach sinh vien theo diem:");
            System.out.println(" 5.Ket thuc:");
            System.out.println("---------------------------------------------");
            System.out.println(" ban chon (1->5):");
            chon = SR.nextInt();
            switch (1) {
                case 1:
                    NhapDS();
                    break;
                case 2:
                    XuatDS();
                    break;
                case 3:
                    xuatDSGioi();
                    break;
                case 4:
                    SapXepDSSV();
                    break;
                case 5:
                    System.out.println("thoat ra man hinh");
            }

        } while (chon != 5);

    }

    private static void NhapDS() {
        String tieptuc = "y";
        do {
            SinhVien sv = null;
            Scanner SR1 = new Scanner(System.in);
            Scanner SR2 = new Scanner(System.in);
            System.out.println("Thuc hien nhap danh sach sinh vien:");
            int chon = 0;
            System.out.println("cho biet loai sinh vien(IT:1),(Biz:2)");
            chon = SR1.nextInt();
            if (chon == 1) {
                System.out.println("Ho ten:");
                String hoten = SR2.nextLine();
                System.out.println("Diem java:");
                Double java = SR1.nextDouble();
                System.out.println("Diem CSS:");
                double CSS = SR1.nextDouble();
                System.out.println("Diem HTML:");
                double HTML = SR1.nextDouble();
                sv = new SinhVienIT(hoten, java, CSS, HTML);
            } else if (chon == 2) {
                System.out.println("Ho Ten:");
                String hoten = SR2.nextLine();
                System.out.println("Diem maketing:");
                double MKT = SR1.nextDouble();
                System.out.println("Diem Sales:");
                double SAl = SR1.nextDouble();
                sv=new SinhVienBiz(hoten, MKT, SAl);
            }if (sv !=null){
                DS.add(sv);
            }
            System.out.println("co tiep tuc (y/n)");
            tieptuc=SR2.nextLine();
        } while (tieptuc.equalsIgnoreCase("y"));
    }

    private static void XuatDS() {
        System.out.println("Thuc hien xuat danh sach");
        for(SinhVien sv:DS){
            sv.xuat();
        }
    }

    private static void xuatDSGioi() {
        for (SinhVien sv:DS) {
            if(sv.getDiem()<9 && sv.getDiem()>=7.5){
            sv.xuat();
            }
        }
    }

    private static void SapXepDSSV() {
        Comparator<SinhVien> cmp =new Comparator<SinhVien>() {
            @Override
                public int compare(SinhVien sv1 , SinhVien sv2){
                return (sv1.getDiem().compareTo(sv2.getDiem()));
                }                
        };
        Collections.sort(DS,cmp);
    }
}
