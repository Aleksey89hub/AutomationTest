package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class OnlinerHelper extends AbstractPageOnliner {


    private static final String ARTICLE_NAME = "//*[@class='b-main-navigation__text']";
    private static final String laptopButton = "//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[1]/div/ul/li[2]/a";
    private static final String testCheckBox = "//*[@id=\"schema-filter\"]/div[3]/div[4]/div[2]/ul/li[1]/label/span[1]/span";
    private static final String data2019 = "//*[@id=\"schema-filter\"]/div[3]/div[8]/div[3]/ul/li[1]/label/span[1]/span";
    private static final String checkBoxColor = "//*[@id=\"schema-filter\"]/div[3]/div[23]/div[3]/ul/li[1]/label/span[1]/span";

    //    public static OnlinerHelper getLoginPage() {
//        OnlinerHelper onlinerHelper = new OnlinerHelper();
//        waitForElementVisible(getElementBy(articleName1));
//        System.out.println("Onliner page is opened!");
//        return onlinerHelper;
//    }

    public OnlinerHelper navigateToLoginPage() {
        openUrl(baseurl1);
        return null;

    }

    public void clickOnArticle() {
        getElement(ARTICLE_NAME).click();
        waitForElementVisible(getElementBy(laptopButton));
        getElement(laptopButton).click();


    }

    public void selectCheckBox() {
        WebDriver driver = getDriver();
        Map<String, WebElement> checkboxesByXpath = new HashMap<>();

        checkboxesByXpath.put(testCheckBox, driver.findElement(By.xpath(testCheckBox)));
        checkboxesByXpath.put(data2019, driver.findElement(By.xpath(data2019)));
        checkboxesByXpath.put(checkBoxColor, driver.findElement(By.xpath(checkBoxColor)));

        clickUnselectedCheckboxes(checkboxesByXpath);
    }

    private void clickUnselectedCheckboxes(Map<String, WebElement> checkboxesByXpath) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();

        for (Map.Entry<String, WebElement> checkbox : checkboxesByXpath.entrySet()) {
            WebElement element = checkbox.getValue();
            jsExecutor.executeScript("arguments[0].scrollIntoView()", element);
            String xPath = checkbox.getKey();
            waitForElementClickable(By.xpath(xPath));

            if (!element.isSelected()) {
                element.click();
            }
        }
    }

    public boolean existsElements() {
        try {
            getElement(testCheckBox);
            getElement(data2019);
            getElement(checkBoxColor);

            System.out.println("element " + testCheckBox + data2019 + checkBoxColor + "are presented");
        } catch (NoSuchElementException e) {
            return false;
        }
        System.out.println("elements are present");
        return true;
    }

    public boolean isWriteLetterBtnDisplayed() {
        WebDriver driver = getDriver();
        waitForElementClickable(getElementBy(testCheckBox));
        List<WebElement> elements = new ArrayList<>();
        elements.add(driver.findElement(By.xpath(testCheckBox)));
        elements.add(driver.findElement(By.xpath(data2019)));
        elements.add(driver.findElement(By.xpath(checkBoxColor)));
        for (WebElement elements1 : elements) {
            if (elements1.isSelected()) {
                elements1.isDisplayed();


            }
            System.out.println("Element is  displayed ");
        }
        return false;
    }
}
