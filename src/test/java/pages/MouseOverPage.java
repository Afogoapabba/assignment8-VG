package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class MouseOverPage {
    public Locator getClickMeLink() {
        return clickMeLink;
    }

    Locator clickMeLink;

    public MouseOverPage(Page page){
        this.clickMeLink = page.getByText("Click me");

    }
}
