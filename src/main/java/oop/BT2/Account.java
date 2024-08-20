/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.BT2;

/**
 *
 * @author ADMIN
 */
public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void credit(int amount) {
        if (balance < amount) {
            balance += amount;
            System.out.println("thanh toan thanh cong:");
        } else {
            System.out.println("thuc hien khong thanh cong:");

        }

    }

    public void debit(int amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println("thanh toan thanh cong:");
        } else {
            System.out.println("thuc hien khong thanh cong:");
        }
    }

    public void TraferTo(Account other, int amount) {
        if (balance >= amount) {
            balance -= amount;
            other.balance += amount;
            System.out.println("giao dich thanh cong:");
        } else {
            System.out.println("thuc hien khong thanh cong:");

        }
    }

}
