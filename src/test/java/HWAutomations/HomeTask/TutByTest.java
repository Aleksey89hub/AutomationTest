package HWAutomations.HomeTask;

import HWAutomations.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TutByTest {
HomePage homePage;
WebDriver driver;

    @BeforeTest
    public void setUp(){
      driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://www.tut.by/");

    }
    @Test
    public void tutBy(){
        homePage=new HomePage(driver);
        homePage.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
    }



}

