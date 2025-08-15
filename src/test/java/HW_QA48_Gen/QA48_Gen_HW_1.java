package HW_QA48_Gen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class QA48_Gen_HW_1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ed.kidskey.org/");
    }

    @Test
    public void openKidskeyTest() {
        System.out.println("Kidskey opened");
    }
}

