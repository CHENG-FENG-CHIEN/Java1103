package com.ocp16_Exception;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginSystem2 {
    private static List<String> users = Arrays.asList("john","mary","admin");
    
    public static boolean login(String username) throws LoginException{
        boolean check = users.stream().filter(name -> name.equals(username)).findFirst().isPresent();
        if(check == false){
            LoginException le = new LoginException("無此帳號");
            throw le;
        }
        return check;
    }
    public static void main(String[] args) {
        try {
            System.out.println(login("apple"));
        } catch (LoginException ex) {
            System.out.println(ex.getMessage());
            ex.怎麼辦();
        }
       
    }
}
