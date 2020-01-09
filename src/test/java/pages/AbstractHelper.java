package pages;

public class AbstractHelper {
    AbstractPageOnliner abstractPage = new AbstractPageOnliner();

    public void quit() {

        abstractPage.getDriver().quit();
    }
}
