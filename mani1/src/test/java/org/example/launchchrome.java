package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchchrome {


    @Test
    public void chrome(){

        System.setProperty("webdriver.chrome.driver", "C:\\Java\\BrowserDrivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");


    }
}