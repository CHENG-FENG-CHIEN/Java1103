package com;

public class S1 {
    protected void display(int x){
        System.out.print("Parent"+ x);
    }
}
class S2 extends S1{
    public void display(int x,int y){
        this.display(x);
        display(y);
        super.display(y);
    }
    public void display(int x){
        System.out.println("child"+x);
    }
    public static void main(String[] args) {
        S1 sobj = new S2();
        sobj.display(10);
    }
}
