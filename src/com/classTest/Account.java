package com.classTest;

/**
 * Author:zhou-study
 * Other: 2021/8/31 - 22:01
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterstRate;

    public Account(int id, double balance, double annualInterstRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterstRate = annualInterstRate;
    }

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterstRate() {
        return annualInterstRate;
    }

    public void setAnnualInterstRate(double annualInterstRate) {
        this.annualInterstRate = annualInterstRate;
    }

    //取款方式
    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("余额不够，请认真存钱！！");
        }
        System.out.println("成功取出："+amount);
        balance = balance - amount;
    }
    //存款方式
    public void deposit(double amount){
//        Account ac = new Account();
        System.out.println("成功存入："+amount);
        balance = balance + amount;
    }


}
