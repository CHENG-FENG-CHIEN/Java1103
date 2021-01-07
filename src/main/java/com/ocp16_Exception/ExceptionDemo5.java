package com.ocp16_Exception;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        try {
            calcBMI(170, 60);
            System.out.println(calcBMI(170, 60));
        } catch (Exception e) {
            System.out.println(e);
        }
        
         try {
            calcBMI(-170, 60);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static double calcBMI(double h, double w) throws Exception{
        if(h <= 0){
            Exception e = new Exception("身高不可 <= 0");
            throw e;
        }
          if(w <= 0){
            Exception e = new Exception("體重不可 <= 0");
            throw e;
        }
          return w/Math.pow(h/100, 2);
    }
}
