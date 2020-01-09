package pages;

public class Helper extends AbstractHelper {

    OnlinerHelper onlinerHelper = new OnlinerHelper();
    AbstractHelper abstractHelper=new AbstractHelper();

    public Helper openLoginPage() {
        System.out.println("Navigate to article page...");
        onlinerHelper.navigateToLoginPage();
        return this;
    }

    public Helper pageCliker() {
        System.out.println("clicking on the article");
        onlinerHelper.clickOnArticle();

        return checkBox();
    }
    public Helper checkBox(){
        System.out.println("clicking on the checkBox");
        onlinerHelper.selectCheckBox();
        onlinerHelper.isWriteLetterBtnDisplayed();

        return this;
    }
    public void quit(){
        System.out.println("closing the page ");
        abstractHelper.quit();
    }

//    public boolean checkPageWithEmailsOpened() {
//        return onlinerHelper.isWriteLetterBtnDisplayed();
//    }

}
