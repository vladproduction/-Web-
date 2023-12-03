package com.vladproduction.project;

import com.vladproduction.project.factory.DriverFactory;
import com.vladproduction.project.factory.DriverFactoryImpl;

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
