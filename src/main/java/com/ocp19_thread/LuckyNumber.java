package com.ocp19_thread;

public class LuckyNumber extends Thread {
    private static final int Lucky_Number =777;
    @Override
    public void run() {
                   
            String name = Thread.currentThread().getName();
            for (int i = 1;true; i++) {
                int x = (int)(Math.random() * 1000);
                if(x  == Lucky_Number){
                    System.out.printf("%s 總共取了 %d次 取到 %d\n",name,i,Lucky_Number);
                    break;
                }
            }
        }
    }


