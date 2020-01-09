package pages;

import by.stormnet.automation.core.utils.FrameworkCore;
import by.stormnet.automation.core.utils.PauseLength;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AbstractPageOnliner extends FrameworkCore {

    private static WebDriver driver = getInstance();

    public WebDriver getDriver() {
        return driver;
    }

    public void openUrl(String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static By getElementBy(String element) {
        return By.xpath(element);
    }

    public static void waitForElementVisible(By by) {
        try {
            WebDriverWait waiter = new WebDriverWait(driver, PauseLength.MIN.value());
            waiter.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

    public static WebElement waitForElementClickable(By by) {
        try {
            WebDriverWait waiter = new WebDriverWait(driver, PauseLength.MAX.value());
            waiter.until(ExpectedConditions.elementToBeClickable(by));
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public WebElement getElementLink(String element) {
        return driver.findElement(By.xpath(element));

    }

    public WebElement getElementLinkText(String element) {
        return driver.findElement(By.linkText(element));
    }

    public WebElement getElement(String element) {
        return driver.findElement(By.xpath(element));

    }

    public List<WebElement> getElements(String element) {
        return driver.findElements(By.xpath(element));
    }

}



