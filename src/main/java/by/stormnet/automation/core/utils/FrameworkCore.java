package by.stormnet.automation.core.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkCore {
    private static WebDriver webDriver;
    private static String browser = IOUtils.loadGenericProperties("browser", "configuration");
    public static String baseUrl = IOUtils.loadGenericProperties("baseUrl", "configuration");
    public static String baseurl1 =IOUtils.loadGenericProperties("baseUrl1","configuration");
    public static String baseUrl2 =IOUtils.loadGenericProperties("baseUrl2","configuration");
    public static WebDriver getInstance(){
        if(browser.equals(BrowserConstants.CHROME)){
            webDriver = new ChromeDriver();
        }else {
            if(browser.equals(BrowserConstants.FIREFOX)){
                webDriver = new FirefoxDriver();
            }else {
                throw new IllegalArgumentException("Browser value from property file is incorrect!");
            }
        }

        return webDriver;
    }
}
