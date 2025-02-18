package by.stormnet.web.helpers.pages;
import by.stormnet.automation.core.utils.IOUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
    private LoginHelper loginHelper = new LoginHelper();
    private String username;
    private String password;

    @BeforeClass
    public void setUp(){
        username = IOUtils.loadGenericProperties("username", "configuration");
        password = IOUtils.loadGenericProperties("password", "configuration");

        loginHelper.openLoginPage();
    }

    @Test
    public void loginTest(){
        loginHelper.login(username, password);
        Assert.assertTrue(loginHelper.checkPageWithEmailsOpened(), "User is not logged in successfully!");
    }

    @AfterClass
    public void tearDown(){
        loginHelper.quit();
    }
}
