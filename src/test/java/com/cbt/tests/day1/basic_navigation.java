package com.cbt.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class basic_navigation {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();


        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.de/");
        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();


        Thread.sleep(5000);

        driver .navigate().forward();
        System.out.println(driver.getTitle());

    }
}