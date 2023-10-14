package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class VisibilityPage {
    public Locator getHideButton() {
        return hideButton;
    }

    public Locator getOpacityButton() {
        return opacityButton;
    }

    public Locator getRemovedButton() {
        return removedButton;
    }

    public Locator getVisibilityHiddenButton() {
        return visibilityHiddenButton;
    }

    public Locator getZeroWidthButton() {
        return zeroWidthButton;
    }

    public Locator getDisplayNoneButton() {
        return displayNoneButton;
    }

    public Locator getOverlappedButton() {
        return overlappedButton;
    }

    public Locator getOffscreenButton() {
        return offscreenButton;
    }

    Locator hideButton;
    Locator opacityButton;
    Locator removedButton;
    Locator visibilityHiddenButton;
    Locator zeroWidthButton;
    Locator displayNoneButton;
    Locator overlappedButton;
    Locator offscreenButton;

    public VisibilityPage(Page page){
        this.hideButton = page.locator("#hideButton");
        this.opacityButton = page.locator("#transparentButton");
        this.removedButton = page.locator("#removedButton");
        this.visibilityHiddenButton = page.locator("#invisibleButton");
        this.zeroWidthButton = page.locator("#zeroWidthButton");
        this.displayNoneButton = page.locator("#notdisplayedButton");
        this.overlappedButton = page.locator("#overlappedButton");
        this.offscreenButton = page.locator("#offscreenButton");
    }
}
