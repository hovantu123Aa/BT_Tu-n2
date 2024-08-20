/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.BT2;

/**
 *
 * @author ADMIN
 */
public class Program {

    public static void main(String[] args) {
        Account ac1 = new Account("TK11", "HO VAN TU", 1000000);
        Account ac2 = new Account("TK22", "HAC CONG TU", 500000);
        System.out.println("thong tin tai khoan ban dau");
        System.out.println("TK MY[id:" + ac1.getId() + "name:" + ac1.getName() + "balance" + ac1.getBalance());
        System.out.println("TK MY FRIEND [id:" + ac2.getId() + "name:" + ac2.getName() + "balance" + ac2.getBalance());
        System.out.println("rut 500000 tu tai khoang my");
        ac1.debit(500000);
        System.out.println("nap vao 100000 vao  tai khoang my friend:");
        ac1.credit(100000);
        System.out.println(" chuyen 10000 tu my friend den my:");
        ac2.TraferTo(ac1, 10000);
        System.out.println("thong tin tai khoan sao khi giao dich:");
        System.out.println("TK MY[id:" + ac1.getId() + "name:" + ac1.getName() + "balance" + ac1.getBalance());
        System.out.println("TK MY FRIEND [id:" + ac2.getId() + "name:" + ac2.getName() + "balance" + ac2.getBalance());
    }
}
