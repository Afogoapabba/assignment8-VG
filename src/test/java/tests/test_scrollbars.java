package tests;

import pages.ScrollBarPage;
import com.microsoft.playwright.Locator;
import org.junit.jupiter.api.Test;
import testbase.TestBase;

public class test_scrollbars extends TestBase {
    @Test
    void scrollIntoView(){
        page.navigate("http://uitestingplayground.com/scrollbars");

        ScrollBarPage scrollBarPage = new ScrollBarPage(page);

        scrollBarPage.getHidingButton().scrollIntoViewIfNeeded(new Locator.ScrollIntoViewIfNeededOptions());

        scrollBarPage.getHidingButton().click();
    }
}
