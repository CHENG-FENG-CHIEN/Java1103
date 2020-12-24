package com.ocp14;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> scores = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            scores.add(new Random().nextInt(11));  // 0~10
        }
        System.out.println(scores);
        // 排序
        Collections.sort(scores);
        System.out.println(scores);
        //去掉前面兩個元素
        scores.remove(0); //去掉位置0的元素
        scores.remove(0); //再去掉位置0的元素
        System.out.println(scores);
        scores.remove(scores.size()-1);
        scores.remove(scores.size()-1);
        System.out.println(scores);
        
        double avg =scores.stream()
                .mapToInt(score -> score)
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
