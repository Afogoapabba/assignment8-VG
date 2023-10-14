package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;


public class TextInputPage {
    public Locator getTextBox() {
        return textBox;
    }

    public Locator getButton() {
        return button;
    }

    Locator textBox;
    Locator button;

    public TextInputPage(Page page) {
        this.textBox = page.getByPlaceholder("MyButton");
        this.button = page.locator("#updatingButton");

    }


}
