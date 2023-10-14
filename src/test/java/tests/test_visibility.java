package tests;

import pages.VisibilityPage;
import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
public class test_visibility extends TestBase {

    @Test
    void checkVisibility(){
        page.navigate("http://uitestingplayground.com/visibility");
        VisibilityPage visibilityPage = new VisibilityPage(page);

        visibilityPage.getHideButton().click();

        /*Element is considered visible when it has non-empty bounding box and does not have visibility:hidden computed style.
         Note that elements of zero size or with display:none are not considered visible.*/


        // These cases are covered by .isHidden()
        assertThat(visibilityPage.getVisibilityHiddenButton()).isHidden();
        assertThat(visibilityPage.getDisplayNoneButton()).isHidden();
        assertThat(visibilityPage.getRemovedButton()).isHidden();
        assertThat(visibilityPage.getZeroWidthButton()).isHidden();

        //tricky cases

        // this will only assert 0 visibility but barely visible obj will pass.
        assertThat(visibilityPage.getOpacityButton()).hasAttribute("style","opacity: 0;");
        // not sure how to tackle this. Playwright does not have a native way
        // I guess you could just try to click it and handle the timeout exception but that's ugly.
        //assertThat(visibilityPage.overlappedButton)
        assertThat(visibilityPage.getOffscreenButton()).not().isInViewport();

    }

}
