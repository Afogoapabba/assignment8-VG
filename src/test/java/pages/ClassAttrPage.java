package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class ClassAttrPage {
    public Locator getBlueButton() {
        return blueButton;
    }

    public Locator getYellowButton() {
        return yellowButton;
    }

    public Locator getGreenButton() {
        return greenButton;
    }

    Locator blueButton;
    Locator yellowButton;
    Locator greenButton;
    public ClassAttrPage(Page page){
        this.blueButton = page.locator("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]");
        this.yellowButton = page.locator("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-warning ')]");
        this.greenButton = page.locator("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-success ')]");

    }
}
