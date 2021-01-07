package com.ocp16_Exception;


//電力換算
//V 代表電壓 W 代表瓦數  A 電流
public class Power {
    public int getV(int w ,int a){
        int v =w / a;
        return v; 
    }
    
    public int getA(int w ,int v){
        int a =w / v;
        return a; 
    }
    
    public int getW(int a ,int v){
        int w =a * v;
        return w; 
    }
    
    
    
}
