package HW_QA48_Gen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.List;

public class QA48_Gen_HW_2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void findElementByTagName(){
        WebElement element = driver.findElement(By.tagName("title"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("script"));
        System.out.println(element1.getText());

        List<WebElement> list = driver.findElements(By.className("Notification"));
        System.out.println(list.size());

        List<WebElement> list1 = driver.findElements(By.className("Notification"));
        System.out.println(list1.size());



    }
}
