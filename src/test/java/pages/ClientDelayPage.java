package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ClientDelayPage {
    public Locator getTriggerButton() {
        return triggerButton;
    }

    Locator triggerButton;

    public Locator getContent() {
        return content;
    }

    Locator content;


    public ClientDelayPage(Page page){
        this.triggerButton = page.locator("#ajaxButton");
        this.content = page.locator("#content > p");


    }
}
