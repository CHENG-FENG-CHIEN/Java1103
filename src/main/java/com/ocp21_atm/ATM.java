package com.ocp21_atm;

public class ATM {
    public static void main(String[] args) {
        //帳號(資源)
        Account account = new Account(100000);
        //任務
        Withdraw w1 = new Withdraw(account, 50000); //提款50000
        Withdraw w2 = new Withdraw(account, 30000); //提款30000
        Withdraw w3 = new Withdraw(account, 40000); //提款40000
        //分配任務
        Thread t1 = new Thread(w1,"小名");
        Thread t2 = new Thread(w2,"小懷");
        Thread t3 = new Thread(w3,"小應");
        t1.start();
        t2.start();
        t3.start();
        
    }
}
