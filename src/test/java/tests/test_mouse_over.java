package tests;

import pages.MouseOverPage;
import org.junit.jupiter.api.Test;
import testbase.TestBase;


public class test_mouse_over extends TestBase {

    @Test
    void clickLink() {
        MouseOverPage mouseOverPage = new MouseOverPage(page);
        page.navigate("http://uitestingplayground.com/mouseover");
        // Link text never changes so locating it by text makes this trivial
        mouseOverPage.getClickMeLink().click();
        mouseOverPage.getClickMeLink().click();
        mouseOverPage.getClickMeLink().click();
        mouseOverPage.getClickMeLink().click();
        mouseOverPage.getClickMeLink().click();


    }


}
