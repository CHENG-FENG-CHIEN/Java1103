package com.ocp11.case4_方法內部類別;

public class Bar {
        public  void hello(){
        final int x =100;  //Java8之後可不寫 final
        //x++;
        class Foo{
            void printMe(){
                System.out.println("I am Foo");
                //若要存取 hello() 外部方法的區域變數，則該變數必須為final
                System.out.println(x);
                }
        }
        Foo foo =new Foo();
        foo.printMe();
    }
}
