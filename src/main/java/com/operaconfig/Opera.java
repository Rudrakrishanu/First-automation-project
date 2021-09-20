package com.operaconfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera {

    public static WebDriver driver;

    public static void main(String[] args) {
        launch();

    }
    public static void launch(){
        System.setProperty("webdriver.opera.driver","./src/main/resources/operadriver.exe");
        driver=new OperaDriver();

    }
}
