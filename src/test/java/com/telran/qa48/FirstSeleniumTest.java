package com.telran.qa48;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {

    WebDriver driver;

    //before -setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        //максимамальный размер экрана
        driver.manage().window().maximize();
        driver.navigate().to("https://www.tel-ran.com"); // with history
        //ожидание всех элементов загрузки на сайте до теста
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // driver.get("https://www.google.com"); // without history
        driver.navigate().to("https://www.google.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();//аппликации, где хранятся персональные данные!
    }

    //test -name


    @Test

    public void openGoogleTest() {
        System.out.println("Google opened");
    }


    //after -tearDown
}
