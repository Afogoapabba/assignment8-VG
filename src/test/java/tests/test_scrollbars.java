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
        // Set a timeout so we can se that actual scroll
        scrollBarPage.getHidingButton().scrollIntoViewIfNeeded(new Locator.ScrollIntoViewIfNeededOptions().setTimeout(2000));

        scrollBarPage.getHidingButton().click();
    }
}
