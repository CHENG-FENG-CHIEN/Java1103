package com.ocp13;

import com.github.javafaker.Faker;
import java.util.Random;

public class Exam {
    private String name;
    private int Chinese;
    private int English;
    private int Math;
    private boolean sex; // 男生 true ， 女生 false

    public Exam() {
        Faker faker =new Faker();
        Random r = new Random();      
        name = faker.name().lastName();
        Chinese = r.nextInt(100)+1;
        English = r.nextInt(100)+1;
        Math = r.nextInt(100)+1;
        sex  = r.nextInt(2) == 1 ?true: false;
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int Chinese) {
        this.Chinese = Chinese;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int English) {
        this.English = English;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int Math) {
        this.Math = Math;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Exam{" + "name=" + name + ", Chinese=" + Chinese + ", English=" + English + ", Math=" + Math + ", sex=" + sex + '}';
    }
    
    
    
}

