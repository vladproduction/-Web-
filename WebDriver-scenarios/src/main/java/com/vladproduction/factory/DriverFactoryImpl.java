package com.vladproduction.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactoryImpl implements DriverFactory {
    @Override
    public void create() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        try {
            Thread.sleep(2000);
            driver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
