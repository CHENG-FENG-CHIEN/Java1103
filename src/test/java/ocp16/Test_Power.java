package ocp16;

import com.ocp16_Exception.Power;
import org.junit.Assert;

import org.junit.Test;

public class Test_Power {
    @Test
    public void test1(){
        Power power = new Power();
        int w = 1000; //1000瓦
        int a = 100;  //100安培
        int exp = 10; //10 電壓
        int act = power.getV(w, a);
        Assert.assertEquals(exp, act);
        
    }
    
     @Test
    public void test2(){
        Power power = new Power();
        int w = 1000; 
        int v = 10;
        int exp = 100; 
        int act = power.getA(w, v);
        Assert.assertEquals(exp,act);
        
    }
        @Test
    public void test3(){
        Power power = new Power();
        int a = 100; 
        int v = 10;
        int exp = 1000; 
        int act = power.getW(a, v);
        Assert.assertEquals(exp,act);
        
    }
}