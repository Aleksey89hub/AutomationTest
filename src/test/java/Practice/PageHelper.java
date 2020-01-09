package Practice;

import pages.AbstractHelper;

public class PageHelper extends AbstractHelper {
    LamodaHelper lamodaHelper = new LamodaHelper();

    public PageHelper openLoginPage() {
        System.out.println("Navigate to article page...");
        lamodaHelper.navigateToLoginPage();
        return this;
    }

    public PageHelper pageCliker() {
        System.out.println("clicking on the field");
        lamodaHelper.clickOnArticle();


        return this;
    }

    public void inputData(String s1) {
        lamodaHelper.fillUsernameField(s1).clickOnButton();
    }
    public void clear() {
        lamodaHelper.removeElement();
    }

   public void navigateThroughPagination() throws Exception {
        lamodaHelper.pagination();
   }
   public void checkElementPresent(){
        lamodaHelper.clickOnElement();
        lamodaHelper.existsElements();

   }
    public void addToBasketAnElement(){
        lamodaHelper.chooseElementsForBasket();
        lamodaHelper.validateGoodsPresence();
    }



    public boolean checkPageIsOpened() {
        return lamodaHelper.isWriteLetterBtnDisplayed();
    }

}

