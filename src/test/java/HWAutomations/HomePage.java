package HWAutomations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;


    public void setTutBy(){
        WebDriver driver;
        driver =new ChromeDriver();
        driver.navigate().to("https://www.tut.by/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public  void click(){
        System.out.println("clicking on Кругозор ");
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[5]/div/div/div[1]/div/a")).click();




    }
    public void tab(){

    }

}
