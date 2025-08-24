package HW_QA48_Gen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class QA48_Gen_HW_3 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByCssSelector() {
        driver.findElement(By.cssSelector("ul"));
        driver.findElement(By.cssSelector(".ico-register"));
        driver.findElement(By.cssSelector("[href='/register']"));
        driver.findElement(By.cssSelector("[href^='/reg']"));
        driver.findElement(By.cssSelector("div#topcartlink"));
    }

    @Test
    public void findElementByXpath() {
        driver.findElement(By.xpath("//ul"));
        driver.findElement(By.xpath("//div[@class='product-viewmode']"));
        driver.findElement(By.xpath("//select[@id='products-viewmode']"));
        driver.findElement(By.xpath("//img[@id='main-product-img-72']"));
        driver.findElement(By.xpath("//div[@class='free-shipping']"));
        driver.findElement(By.xpath("//strong[normalize-space()='Filter by price']"));
    }

}
