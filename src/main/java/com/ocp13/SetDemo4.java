package com.ocp13;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class SetDemo4 {

    public static void main(String[] args) {
        Set<Exam> exams = new LinkedHashSet<>();
        IntStream.rangeClosed(1, 20).forEach(i -> exams.add(new Exam()));
        System.out.println("全班成績:" + exams);
        System.out.println("1.國文平均");
        exams.stream().mapToInt(e -> e.getChinese())
                .forEach(score -> System.out.print(score + " ,"));
        System.out.println();
        double avg_Chinese = exams.stream()
                .mapToInt(e -> e.getChinese())
                .average()
                .getAsDouble();
        System.out.println("國文平均:" + avg_Chinese);
        System.out.println("2.英文平均");
        exams.stream().mapToInt(e -> e.getEnglish())
                .forEach(score -> System.out.print(score + " ,"));
        System.out.println();
        double avg_English = exams.stream()
                .mapToInt(e -> e.getEnglish())
                .average()
                .getAsDouble();
        System.out.println("英文平均:" + avg_English);
        System.out.println("3.數學平均");
        exams.stream().mapToInt(e -> e.getMath())
                .forEach(score -> System.out.print(score + " ,"));
        System.out.println();
        double avg_Math = exams.stream()
                .mapToInt(e -> e.getMath())
                .average()
                .getAsDouble();
        System.out.println("數學平均:" + avg_Math);
        
     }
}
