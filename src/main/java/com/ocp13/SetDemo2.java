package com.ocp13;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set set =new HashSet();
        // 今彩 539 , 1~39取五個不重複的數字
        // 電腦選號
        while (set.size() < 5) {            
            //產生一個 1~39的隨機數
            int n = new Random().nextInt(39)+1;
            set.add(n);
            System.out.println("加入==>>>" + n);
        }
        System.out.println(set);
        
    }
}
