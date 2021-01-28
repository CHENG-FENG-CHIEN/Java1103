package com.ocp31_db.drink;

import java.io.IOException;
import java.util.Scanner;

public class DinkStore {

    private static boolean exit;

    public static void main(String[] args) throws Exception {
        while (!exit) {
            menu();
            if(!exit){
            System.out.println("按下Enter鍵繼續");
            System.in.read(); //按下Enter鍵繼續
            }
        }
    }

    public static void menu() {
        System.out.println("-----------");
        System.out.println("1.Read");
        System.out.println("2.Create");
        System.out.println("3.Update amount");
        System.out.println("4.Delete");
        System.out.println("5.Exit");
        System.out.println("-----------");
        service();
    }

    public static void service() {
        DrinkDao dao = new DrinkDao();
        Scanner sc = new Scanner(System.in);
        System.out.print("==>");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                dao.read();
                break;
            case 2:
                System.out.print("請輸入飲料名字:");
                String name = sc.next();
                System.out.print("請輸入飲料價錢:");
                int price = sc.nextInt();
                System.out.print("請輸入飲料數量:");
                int  amount = sc.nextInt();
                dao.create(name, price, amount);
                break;
            case 3:
                System.out.print("請輸入要更改的id:");
                int updateId = sc.nextInt();
                System.out.print("請輸入要更改的飲料數量:");
                int  updateamount = sc.nextInt();
                dao.update(updateId, updateamount);
                break;
            case 4:
                System.out.print("請輸入要刪除的id");
                int deleteid = sc.nextInt();
                dao.delete(deleteid);
                break;
            case 5:
                exit = true;
        }
    }
}
