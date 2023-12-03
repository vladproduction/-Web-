package com.vladproduction.demoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChromeDriverExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        

        driver.get("https://www.google.com");
        

        WebElement findTextArea = driver.findElement(By.id("APjFqb"));
        findTextArea.sendKeys("green apple picture");

        driver.quit();
    }
}
