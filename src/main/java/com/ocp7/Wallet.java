package com.ocp7;

public class Wallet {
    private static String owner ="媽媽的錢包";
    private int money=10_0000;
    public int getAndPrintMoney(){
        //資源指的就是(屬性與方法)
        //在物件方法中 可以存取物件資源與類別資源
        System.out.println(owner);
        System.out.println(money);
        System.out.println(owner +"有$"+money);
        return money;
    }
    public static void printMoney(){
        // 在類別方法中只能存取類別資源
        System.out.println(owner);
        //System.out.println("money="+money);
    }
     public static void printMoney2(){
        // 在類別方法中只能存取類別資源
        System.out.println(owner);
        //除非自行建立物件資源
        Wallet wallet =new Wallet();
        System.out.println("money="+wallet.money);
    }
}
