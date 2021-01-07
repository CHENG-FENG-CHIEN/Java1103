package com.ocp13_CollectionSet;

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
        System.out.println("==========================================================");

        System.out.println("2.英文平均");
        exams.stream().mapToInt(e -> e.getEnglish())
                .forEach(score -> System.out.print(score + " ,"));
        System.out.println();
        double avg_English = exams.stream()
                .mapToInt(e -> e.getEnglish())
                .average()
                .getAsDouble();
        System.out.println("英文平均:" + avg_English);
        System.out.println("==========================================================");

        System.out.println("3.數學平均");
        exams.stream().mapToInt(e -> e.getMath())
                .forEach(score -> System.out.print(score + " ,"));
        System.out.println();
        double avg_Math = exams.stream()
                .mapToInt(e -> e.getMath())
                .average()
                .getAsDouble();
        System.out.println("數學平均:" + avg_Math);
        System.out.println("==========================================================");

        System.out.println("4.國文最高分為?");
        int max_Chinese = exams.stream()
                .mapToInt(e -> e.getChinese())
                .max()
                .getAsInt();
        System.out.println("國文最高分為:" + max_Chinese);

        System.out.print("國文最高分的人是誰?");
        exams.stream()
                .filter(e -> e.getChinese() == max_Chinese)
                .forEach(e -> System.out.print(e.getName() + ","));
        System.out.println();

        System.out.println("6.總成績最高分的人名為何? 是幾分?");
        int max_score = exams.stream()
                .mapToInt(e -> e.getChinese() + e.getEnglish() + e.getMath())
                .max()
                .getAsInt();

        exams.stream().filter(e -> e.getChinese() + e.getEnglish() + e.getMath() == max_score)
                .forEach(e -> System.out.println(e.getName() + "," + max_score));
    }
}
