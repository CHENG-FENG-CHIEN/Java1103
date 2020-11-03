package com.ocp;

public class Classroom {
    
       public static void main(String[] args) {
       //建立(new)學生資料(物件)
       Student s1 = new Student();
       Student s2 = new Student();
       //定義學生屬性
       s1.name ="John";
       s1.age = 18;
       s1.height = 170.0;
       s1.weight = 60.0;
       s1.bmi= s1.weight /Math.pow(s1.height/100,2);
       
       s2.name ="Mary";
       s2.age = 17;
       s2.height = 162.5;
       s2.weight = 48.5;
       s2.bmi= s2.weight /Math.pow(s2.height/100,2);
       
       //印出 學生屬性資料 
           System.out.printf("姓名: %s 年齡: %d 身高:%.1f 體重:%.1f BMI: %.2f\n",s1.name,s1.age,s1.height,s1.weight,s1.bmi);
           System.out.printf("姓名: %s 年齡: %d 身高:%.1f 體重:%.1f BMI: %.2f\n",s2.name,s2.age,s2.height,s2.weight,s2.bmi);
           //印出每個學生BMI
           //例如: John 的 BMI =??
           //Mary 的 BMI =??
          
       
    }
}
