package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
public class ScrollBarPage {
    public Locator getHidingButton() {
        return hidingButton;
    }

    Locator hidingButton;

    public  ScrollBarPage (Page page){
        this.hidingButton = page.locator("#hidingButton");

    }

}
