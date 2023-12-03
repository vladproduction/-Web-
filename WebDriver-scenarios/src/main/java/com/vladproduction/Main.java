package com.vladproduction;

import com.vladproduction.factory.DriverFactory;
import com.vladproduction.factory.DriverFactoryImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com/");
//        Thread.sleep(2000);
//        driver.quit();

        DriverFactory factory = new DriverFactoryImpl();
        factory.create();

        //scenarios received--> web driver do job--> send message what was done(logs) //todo
    }
}
