package com.ocp12.lambda2;

@FunctionalInterface
public interface Add {
    int sum(int x, int y);
    public int hashCode();
    default void copyright(){
    
    }
}
