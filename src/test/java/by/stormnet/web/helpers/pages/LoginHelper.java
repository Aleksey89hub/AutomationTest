package by.stormnet.web.helpers.pages;

import by.stormnet.web.helpers.AbstractHelper;

public class LoginHelper extends AbstractHelper {
    LoginPage loginPage = new LoginPage();
    public LoginHelper openLoginPage(){
        System.out.println("Navigate to Login page...");
        loginPage.navigateToLoginPage();
        return this;
    }

    public LoginHelper login(String username, String password){
        System.out.println("Login to email using " + username + " and password " + password);
        loginPage.fillUsernameField(username)
                .clickEnterPassBtn()
                .fillPassField(password)
                .clickEnterPassBtn();

        return this;
    }

    public boolean checkPageWithEmailsOpened(){
        return loginPage.isWriteLetterBtnDisplayed();
    }

}
