/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lad04.bt3;

/**
 *
 * @author ADMIN
 */
abstract public class SinhVien {

    public String hoten;
    public String nganh;

    public SinhVien() {
    }

    public SinhVien(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }

    abstract public Double getDiem();

    public String getHocLuc() {
        String kq = "";
        double dtb=getDiem();
        if(dtb<5){
            kq="Yeu";
        }else if(dtb<6.5){
            kq="Trung binh";
        }else if(dtb<7.5){
            kq="kha";
        }else if(dtb<9){
            kq="gioi";
            
        }else{
            kq="xuat sac";
        }
        return kq;
    }
    public void xuat(){
        System.out.println("SinhVien[HoTen:"+hoten+"nganh"+nganh+"DTB:"+getDiem()+"Hoc luc"+getHocLuc());
    }
}
