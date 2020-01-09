package Practice;

//import by.stormnet.automation.core.common.RetryAnalyzer;
import by.stormnet.automation.core.utils.IOUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;


public class LamodaTest {
    PageHelper pageDownload = new PageHelper();
    String article;
    private List<String> data;

    @BeforeClass
    public void setUp() {

        article = IOUtils.loadGenericProperties("baseUrl2", "configuration");
        pageDownload.openLoginPage();
    }

    @Test(dataProvider = "dress")
    public void register(String text) {
        pageDownload.pageCliker().inputData(text);
        pageDownload.clear();
        pageDownload.quit();


    }

    @Test
    public void pagination() throws Exception {
        pageDownload.pageCliker().inputData("носки");
        pageDownload.navigateThroughPagination();
        pageDownload.quit();
    }

    @Test
    public void elementsExistence() {
        pageDownload.pageCliker().inputData("носки");
        pageDownload.checkElementPresent();

    }

    @Test
    public void addGoodsToTheBasket() {
        pageDownload.pageCliker().inputData("трусы мужские");
        pageDownload.addToBasketAnElement();
    }


    @DataProvider(name = "dress")
    public Object[][] providerData() {
        return new Object[][]{{"Платья"}, {"Джинсы"}, {"Пальто"}};
    }


    @AfterClass
    public void tearDown() {
        pageDownload.quit();
    }
}

