package com.ocp33_nio;


import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.net.ssl.StandardConstants;

public class FileStreamCopy {
    public static void main(String[] args) throws Exception {
        String urlstr = "https://img.ltn.com.tw/Upload/business/page/800/2020/05/26/240.jpg";
        Path target = Paths.get("src\\main\\java\\com\\ocp33_nio\\icar.jpg");
        Files.copy(new URL(urlstr).openStream(), target, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Stream copy ok!");        
    }
}
