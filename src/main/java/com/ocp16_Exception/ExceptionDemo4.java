
package com.ocp16_Exception;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        bar();  //必須使用 try-catch 或 throws 拋出
      //  foo();  // 直接用即可
    }
    
    public static void foo()throws Exception{ //Checked Exception
        System.out.println("foo");
    }
    
    public static void bar() throws RuntimeException{  //UnChecked Exception
        System.out.println("bar");
    }
}
