/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lad03;

/**
 *
 * @author ADMIN
 */
public class HinhTru extends HinhTron {

    private Double chieucao;

    public HinhTru(double CCao) {
        super(1.0);
        chieucao = 1.0;
    }

    public HinhTru(Double chieucao, Double bankinh) {
        super(bankinh);
        this.chieucao = chieucao;
    }   

    public Double getChieucao() {
        return chieucao;
    }

    public void setChieucao(Double chieucao) {
        this.chieucao = chieucao;
    }

    public Double TinhTheTich() {
        return super.TinhDienTich() * chieucao;
    }

    @Override
    public double TinhDienTich() {
       double dt_day=super.TinhDienTich();
       double dt_xungquanh=super.TinhChuVi()*chieucao;
       return  2*dt_day+ dt_xungquanh;
    }
    @Override
    public void xuat(){
        System.out.println("Hinh tru:"+ chieucao+"dien tich "+TinhDienTich()+"chu vi"+TinhChuVi());
    }
    
       
}
