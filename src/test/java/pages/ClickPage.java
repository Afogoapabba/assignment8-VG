package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ClickPage {
    public Locator getBadButton() {
        return badButton;
    }

    Locator badButton;

    public ClickPage(Page page){
        this.badButton = page.locator("#badButton");
    }

}
