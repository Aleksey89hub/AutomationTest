package HWAutomations.HomeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MainClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.21vek.by/mouses/wireless_keyboards/");
        WebElement list =driver.findElement(By.xpath("//label[@title='HP']"));
        list.click();



    }
}
