package pages;

import by.stormnet.automation.core.utils.IOUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageTests {
    Helper helper = new Helper();
    String article;


    @BeforeClass
    public void setUp() {

        article = IOUtils.loadGenericProperties("baseUrl1", "configuration");
        helper.openLoginPage();

    }


    @Test
    public void onlinerTest() {
        helper.pageCliker();
        
    }

    @AfterTest
    public void tearDown() {
        helper.quit();
    }
}


