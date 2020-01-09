package by.stormnet.web.helpers;

import Practice.LamodaHelper;

public class AbstractHelper {
    LamodaHelper lamodaHelper = new LamodaHelper();
    public void quit(){
        lamodaHelper.getDriver().quit();
    }
}
