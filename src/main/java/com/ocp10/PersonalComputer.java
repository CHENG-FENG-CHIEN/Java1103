package com.ocp10;

public class PersonalComputer  implements Computer{

    @Override
    public int add(int x, int y) {
        return  x+y;
    }

    @Override
    public String getName() {
        return "ASUS";
    }
    
}
