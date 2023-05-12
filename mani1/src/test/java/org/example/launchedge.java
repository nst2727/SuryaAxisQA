package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchedge {

    @Test
    public  void edge() {

        System.setProperty("webdriver.edge.driver", "C:\\Java\\Browser Drivers\\Edge Driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/login/");
    }
}
