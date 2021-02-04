package com.ocp32_io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class ReadTextFromFile {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\ocp32_io\\files\\data.txt");
        
        //使用 try-with-resource 的語法
        try (FileReader r = new FileReader(file)){
           int data =0;
           String alldata ="";
            while ((data = r.read()) != -1) {
               // System.out.print((char)data);
                alldata += (char)data;
            }
            System.out.printf("檔案內容: %s\n",alldata);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
