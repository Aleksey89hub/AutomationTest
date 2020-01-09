package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AbstractPageOnliner;

import java.util.List;
import java.util.NoSuchElementException;

public class LamodaHelper extends AbstractPageOnliner {
    String lamodaLink = "https://www.lamoda.by/";
    String searchField = "//div[@class='search js-search']//input";
    String searchShoes = "Товары по запросу";
    String button = "//div[@class='button button_blue search__button js-search-button']";
    String ppagination = "//*[@class='paginator__pages']";
    String socksElement = "/html/body/div[1]/div[7]/div[2]/div[2]/div/div/div[3]/div[2]/a/span";
    String description = "//*[@id=\"vue-root\"]/div[3]/div/div/div[1]/div/div[4]";
    String price = "//*[@id=\"vue-root\"]/div[3]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/span[3]";
    String textForChecking = "2  товара";
    String rating = "//*[@class='rev-rating-stars stars-front-svg']";
    String feedBack = "//*[@rev__trigger rev__trigger_reviews rev__trigger_active']";
    String addToBucket = "//*[@class='product__cart-add-button button button_l button_blue']";

    String underpants1 = "//*[@id=\"vue-root\"]/div[4]/div[2]/div[2]/div/div/div[3]/div[1]/a/span";
    String basketButton = "//*[@id=\"vue-root\"]/div[3]/div/div/div[1]/div/div[2]/div/div[4]/button/span";
    String size = "//*[@id=\"vue-root\"]/div[3]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div/div/div[3]/div[2]/div[2]/div/div[1]/div[5]";
    String keepOnBuying = "//*[@class='button button_outline link post-cart-add__close']";
    String returnToTheMainPage = "//*[@id=\"breadcrumbs\"]/span[4]/a/span";
    String underpants2 = "//*[@class='price__new parts__price_cd-disabled']";
    String basketButton2 = "//*[@class='product__cart-add-button button button_l button_blue']";
    String size2 = "//*[@id=\"vue-root\"]/div[3]/div/div/div[1]/div/div[2]/div/div[3]/div[2]/div/div/div[3]/div[2]/div[2]/div/div[1]/div[2]";
    String basket = "//*[@class='link user-nav__link user-nav__link_cart-not-empty js-basket-button-title']";

    WebDriver driver;

    public static LamodaHelper getLoginPage() {
        LamodaHelper lamodaHelper = new LamodaHelper();
        waitForElementVisible(getElementBy(baseUrl2));
        System.out.println("Onliner page is opened!");
        return lamodaHelper;
    }

    public LamodaHelper navigateToLoginPage() {
        openUrl(baseUrl2);
        return getLoginPage();

    }

    public void removeElement() {
        getElementLink(searchField).clear();
    }

    public void clickOnArticle() {
        getElementLink(searchField).click();

    }

    public LamodaHelper fillUsernameField(String s1) {
        getElementLink(searchField).sendKeys(s1);
        return getLoginPage();
    }

    public void clickOnButton() {
        getElement(button).click();
    }

    public boolean isWriteLetterBtnDisplayed() {
        waitForElementClickable(getElementBy(searchField));
        return getElementLink(searchShoes).isDisplayed();
    }

    public void pagination() throws Exception {
        List<WebElement> pagination = getDriver().findElements(By.xpath(ppagination));
        if (pagination.size() > 0) {
            System.out.println("pagination exists");
            for (int i = 0; i < pagination.size(); i++) {
                pagination.get(i).click();

            }
        } else {
            System.out.println("pagination not exists");
        }

    }

    public boolean existsElements() {
        try {
            getElement(description);
            getElementLink(price);
            // getElementLink(feedBack);
            //getElementLink(addToBucket);
            System.out.println("element " + description + "is presented");
        } catch (NoSuchElementException e) {
            return false;
        }
        System.out.println("elements are present");
        return true;
    }

    public void clickOnElement() {
        waitForElementClickable(getElementBy(socksElement));
        getElementLink(socksElement).click();
    }

    public void chooseElementsForBasket() {
        waitForElementClickable(getElementBy(underpants1));
        getElement(underpants1).click();
        getElement(basketButton).click();
        getElement(size).click();
        waitForElementClickable(getElementBy(keepOnBuying));
        getElement(keepOnBuying).click();
        getElement(returnToTheMainPage).click();
        waitForElementClickable(getElementBy(underpants2));
        getElement(underpants2).click();
        getElement(basketButton2).click();
        getElement(size2).click();
        waitForElementClickable(getElementBy(keepOnBuying));
        getElement(keepOnBuying).click();
        getElement(returnToTheMainPage).click();
        getElement(basket).click();

    }

    public void validateGoodsPresence() {
        if (driver.getPageSource().contains("2 ТОВАРА")) {
            System.out.println("Goods are present");
        } else {
            System.out.println("Goods are absent");
        }
    }

}




