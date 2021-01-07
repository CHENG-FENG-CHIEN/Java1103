package com.ocp16_Exception;

import java.util.Arrays;
import java.util.List;

public class LoginSystem {
    private static List<String> users = Arrays.asList("john","mary","admin");
    
    public static boolean login(String username){
        boolean check = users.stream().filter(name -> name.equals(username)).findFirst().isPresent();
        return check;
    }
    public static void main(String[] args) {
        System.out.println(login("apple"));
        System.out.println(login("admin"));
    }
}
