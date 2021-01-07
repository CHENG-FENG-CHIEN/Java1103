package com.ocp16_Exception;

class Foo extends RuntimeException{
    
}


class Bar extends RuntimeException{
    
}

class Sub extends Bar{
    
}

public class ExceptionDemo6 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (Foo |Bar e) {
            
        }
      //  try {
            System.out.println(10/0);
        //} catch (Bar |Sub e) {  //Bar  and sub 有繼承關係所以會錯誤
            
        }
    }

